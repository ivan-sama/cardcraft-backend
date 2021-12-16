package com.cardcraft.backend;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.joran.conditional.IfAction;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/users")
class UserController {
    private ResourceBundleMessageSource messageSource;
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserRepo userRepo;

    @GetMapping("/by_id/{id}")
    public Optional<CardCraftUser> getById(@PathVariable Long id) {
        return userRepo.findById(id);
    }

    @PostMapping("/signup")
    public SignUpResponse getByName(
            @RequestHeader(name = "Accept-Language", required = false) final Locale locale,
            @Valid SignUpDTO dto,
            BindingResult result) {

        SignUpResponse response = new SignUpResponse();
        CardCraftUser user = new CardCraftUser();

        user.setName(dto.getName());
        user.setPassword(dto.getPassword());
        user.setEmail(dto.getEmail());

        List<String> list = result.getFieldErrors().stream()
                .map(fieldError -> fieldError.getDefaultMessage())
                .collect(Collectors.toList());

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userRepo.save(user);

        return response;
    }
}
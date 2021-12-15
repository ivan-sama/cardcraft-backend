package com.cardcraft.backend;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/users")
class UserController {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserRepo userRepo;

    @GetMapping("/by_name/{}")
    public Optional<CardCraftUser> getById() {
        return userRepo.findById(0L);
    }

    @GetMapping()
    public CardCraftUser getByName() {
        return userRepo.findByName("");
    }
}
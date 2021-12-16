package com.cardcraft.backend;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
class SignUpDTO {
    @Size(min = CardCraftUser.USER_NAME_MIN_SIZE, max = CardCraftUser.USER_NAME_MAX_SIZE)
    private String name;
    @Size(max = CardCraftUser.USER_EMAIL_MAX_SIZE)
    private String email;
    @Size(min = CardCraftUser.USER_PASSWORD_MIN_SIZE, max = CardCraftUser.USER_PASSWORD_MAX_SIZE)
    private String password;
}
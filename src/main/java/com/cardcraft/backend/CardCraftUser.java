package com.cardcraft.backend;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Table(name = "user")
@Entity
public class CardCraftUser {
    @Id
    private Long id;
    private String name;
    @Column(length = USER_EMAIL_MAX_SIZE)
    private String email;
    @Column(length = USER_PASSWORD_MAX_SIZE)
    private String password;
    private Integer level;
    private Integer xp;
    private Integer bpLevel;
    private Integer coins;
    private Integer screws;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Card> availableCards;

    public static final int USER_NAME_MAX_SIZE = 32;
    public static final int USER_NAME_MIN_SIZE = 5;

    public static final int USER_PASSWORD_MAX_SIZE = 72;
    public static final int USER_PASSWORD_MIN_SIZE = 8;

    public static final int USER_EMAIL_MAX_SIZE = 32;
}

package com.cardcraft.backend;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "user")
@Entity
public class CardCraftUser {
    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
    private Integer level;
    private Integer xp;
    private Integer bpLevel;
    private Integer coins;
    private Integer screws;
}

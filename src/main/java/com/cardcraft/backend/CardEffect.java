package com.cardcraft.backend;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "card_effect")
@Entity
public class CardEffect {
    @Id
    private Long id;
    private String name;
}

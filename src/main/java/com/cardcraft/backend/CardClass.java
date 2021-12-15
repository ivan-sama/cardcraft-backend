package com.cardcraft.backend;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "card_class")
@Entity
public class CardClass {
    @Id
    private Long id;
    private String name;
}

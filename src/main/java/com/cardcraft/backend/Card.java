package com.cardcraft.backend;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "card")
@Entity
public class Card {
    @Id
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    private List<CardClass> clases;
    @OneToMany(cascade = CascadeType.ALL)
    private List<CardElement> element;
    @OneToMany(cascade = CascadeType.ALL)
    private List<CardEffect> efect;
    private Integer atk;
    private Integer def;
    private Integer baseCost;
    private String imgPath;
}

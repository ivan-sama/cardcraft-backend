package com.cardcraft.backend;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Table(name = "stats")
@Entity
public class CardStats {
    @Id
    private Long id;
    private String name;
    private String element;
    private String efect;
    private Integer atk;
    private Integer def;
}
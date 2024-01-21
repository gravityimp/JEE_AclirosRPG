package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Armor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private Integer armor;

    @Setter
    @Getter
    @Column
    private Integer resistance;

    @Setter
    @Getter
    @Column
    private Integer regeneration;

    @Setter
    @Getter
    @Column
    private Integer health;

    @Setter
    @Getter
    @Column
    private Integer armorMagic;
}

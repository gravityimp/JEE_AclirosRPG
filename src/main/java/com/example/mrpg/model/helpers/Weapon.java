package com.example.mrpg.model.helpers;

import com.example.mrpg.model.base.Item;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int minDmg;

    @Column
    private int maxDmg;

    @Column
    private int vampirism;

    @Column
    private int critChance;

    @Column
    private int minMagicDmg;

    @Column
    private int maxMagicDmg;

    @OneToOne(mappedBy = "weapon")
    private Item item;
}

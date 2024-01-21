package com.example.mrpg.model.base;

import com.example.mrpg.model.enums.ItemType;
import com.example.mrpg.model.enums.Rarity;
import com.example.mrpg.model.helpers.*;
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
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Rarity rarity;

    @Column
    private String lore;

    @Column
    private Boolean playerBound = false;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "requirements_id")
//    private Requirements requirements;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "action_id")
//    private Action action;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "recipe_id")
//    private Recipe recipe;
//
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weapon_id")
    private Weapon weapon;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "armor_id")
//    private Armor armor;
}

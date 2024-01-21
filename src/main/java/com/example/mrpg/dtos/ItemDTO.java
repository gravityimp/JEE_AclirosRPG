package com.example.mrpg.dtos;

import com.example.mrpg.model.enums.ItemType;
import com.example.mrpg.model.enums.Rarity;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDTO {
    private String name;
    private ItemType itemType;
    private Rarity rarity;
    private String lore;
    private Boolean playerBound;

    // Weapon
    private int minDmg;
    private int maxDmg;
    private int vampirism;
    private int critChance;
    private int minMagicDmg;
    private int maxMagicDmg;
}

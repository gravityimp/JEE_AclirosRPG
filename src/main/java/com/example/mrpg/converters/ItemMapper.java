package com.example.mrpg.converters;

import com.example.mrpg.dtos.ItemDTO;
import com.example.mrpg.model.base.Item;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ItemMapper {
    @Mapping(target = "minDmg", source = "weapon.minDmg")
    @Mapping(target = "maxDmg", source = "weapon.maxDmg")
    @Mapping(target = "vampirism", source = "weapon.vampirism")
    @Mapping(target = "critChance", source = "weapon.critChance")
    @Mapping(target = "minMagicDmg", source = "weapon.minMagicDmg")
    @Mapping(target = "maxMagicDmg", source = "weapon.maxMagicDmg")
    ItemDTO itemToItemDTO(Item item);
}

package com.example.mrpg.repository;

import com.example.mrpg.dtos.ItemDTO;
import com.example.mrpg.model.base.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
    @Query("select new com.example.mrpg.dtos.ItemDTO(i.name, i.itemType, i.rarity, i.lore, i.playerBound, i.weapon.minDmg, i.weapon.maxDmg, i.weapon.vampirism, i.weapon.critChance, i.weapon.minMagicDmg, i.weapon.maxMagicDmg) from Item i")
    List<ItemDTO> findAllItems();
}

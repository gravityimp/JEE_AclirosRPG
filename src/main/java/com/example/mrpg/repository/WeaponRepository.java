package com.example.mrpg.repository;

import com.example.mrpg.model.helpers.Weapon;
import org.springframework.data.repository.CrudRepository;

public interface WeaponRepository  extends CrudRepository<Weapon, Long> {
}

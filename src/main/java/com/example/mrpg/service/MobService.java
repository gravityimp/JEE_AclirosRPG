package com.example.mrpg.service;

import com.example.mrpg.model.base.Mob;
import com.example.mrpg.repository.MobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobService {

    @Autowired
    private MobRepository mobRepository;

    public List<Mob> getAllMobs() {
        return (List<Mob>) mobRepository.findAll();
    }

    public Mob getMobById(Long id) {
        return mobRepository.findById(id).orElse(null);
    }

    public Mob saveMob(Mob mob) {
        return mobRepository.save(mob);
    }

    public void deleteMob(Long id) {
        mobRepository.deleteById(id);
    }
}

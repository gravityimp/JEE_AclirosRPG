package com.example.mrpg.controller;

import com.example.mrpg.model.base.Mob;
import com.example.mrpg.service.MobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mobs")
public class MobController {

    @Autowired
    private MobService mobService;

    @GetMapping
    public List<Mob> getAllMobs() {
        return (List<Mob>) mobService.getAllMobs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mob> getMobById(@PathVariable Long id) {
        Mob mob = mobService.getMobById(id);
        return mob != null ? ResponseEntity.ok(mob) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Mob saveMob(@RequestBody Mob mob) {
        return mobService.saveMob(mob);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMob(@PathVariable Long id) {
        mobService.deleteMob(id);
        return ResponseEntity.noContent().build();
    }
}

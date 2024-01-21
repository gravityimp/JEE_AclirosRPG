package com.example.mrpg.model.base;

import com.example.mrpg.model.enums.Hostility;
import com.example.mrpg.model.enums.MobType;
import com.example.mrpg.model.helpers.Drop;
import com.example.mrpg.model.helpers.Equipment;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Mob {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private MobType type = MobType.NORMAL;

    @Column(nullable = false)
    private String mobType;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private Hostility hostility;

    @Column(nullable = false)
    private Boolean isBaby = false;

    @Column(nullable = false)
    private Integer level = 1;

    @Column(nullable = false)
    private Integer health = 10;

    @Column(nullable = false)
    private Integer damage = 0;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "equipment_id")
    private Equipment equipment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "drop_id")
    private Drop drops;

    @ElementCollection
    private List<String> skills;
}

package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Drop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private Integer experience;

    @Setter
    @Getter
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "itemdrop_id")
    private List<ItemDrop> items;
}

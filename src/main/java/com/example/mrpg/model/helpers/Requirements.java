package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Requirements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private Integer level;

    @Setter
    @Getter
    @Column
    private Integer strength;

    @Setter
    @Getter
    @Column
    private Integer agility;

    @Setter
    @Getter
    @Column
    private Integer intelligence;

    @Setter
    @Getter
    @Column
    private Integer quest;
}

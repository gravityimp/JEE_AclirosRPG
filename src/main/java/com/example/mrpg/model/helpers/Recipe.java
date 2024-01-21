package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private Integer resultId;

    @Setter
    @Getter
    @Column
    private Integer resultAmount = 1;

    @Setter
    @Getter
    @Column
    private Integer firstItemId;

    @Setter
    @Getter
    @Column
    private Integer firstItemAmount = 1;

    @Setter
    @Getter
    @Column
    private Integer secondItemId;

    @Setter
    @Getter
    @Column
    private Integer secondItemAmount = 1;
}

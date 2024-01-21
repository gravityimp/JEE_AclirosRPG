package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class ItemDrop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private Integer itemId;

    @Setter
    @Getter
    @Column
    private Integer itemAmount;

    @Setter
    @Getter
    @Column
    private Integer maxItemAmount;

    @Setter
    @Getter
    @Column
    private Double chance;
}

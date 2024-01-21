package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private Double x;

    @Setter
    @Getter
    @Column
    private Double y;

    @Setter
    @Getter
    @Column
    private Double z;

    @Setter
    @Getter
    @Column
    private Double pitch;

    @Setter
    @Getter
    @Column
    private Double yaw;
}

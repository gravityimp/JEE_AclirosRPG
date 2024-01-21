package com.example.mrpg.model.helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    private String main = "air";

    @Setter
    @Getter
    @Column
    private String off = "air";

    @Setter
    @Getter
    @Column
    private String head = "air";

    @Setter
    @Getter
    @Column
    private String chest = "air";

    @Setter
    @Getter
    @Column
    private String legs = "air";

    @Setter
    @Getter
    @Column
    private String feet = "air";
}

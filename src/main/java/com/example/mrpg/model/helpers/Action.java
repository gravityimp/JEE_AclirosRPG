package com.example.mrpg.model.helpers;

import com.example.mrpg.model.enums.ActionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Action {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @Column
    @Enumerated(EnumType.STRING)
    private ActionType actionType;

    @Setter
    @Getter
    @Column
    private Integer xpAmount;

    @Setter
    @Getter
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location tpLocation;
}

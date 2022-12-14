package com.example.dardypwork.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "residences")
public class Residence {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private City city;
    @Column
    private String street;
    @Column
    private String houseNumber;
    @Column
    private int floor;
    @Column
    private int totalFloors;
    @Column
    private int roomNumber;
    @Column
    private int buildYear;
    @Column
    private int kitchenArea;
    @Column
    private int fullArea;
}


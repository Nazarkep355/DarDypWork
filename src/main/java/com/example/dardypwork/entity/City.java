package com.example.dardypwork.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity
@Table(name = "cities")
@Setter
@Getter
public class City {
    @Id
    private Long id;
    @Column
    private String ukName;
    @Column
    private String enName;

}

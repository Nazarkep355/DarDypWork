package com.example.dardypwork.entity;

import com.example.dardypwork.entity.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    @Pattern(regexp = "+[\\d]{9,13}")
    private String phone;
    @Column
    private String firstName;
    @Column
    private String secondName;
    @Column
    private UserRole role;

}

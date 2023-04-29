package com.geekster.h2Fun.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Integer id;

    @Column(name="user_name",unique = true)
    private String name;

    @Column(name="user_age")
    private Integer age;

    @Column(name="date_of_birth")
    private LocalDate dob;

}

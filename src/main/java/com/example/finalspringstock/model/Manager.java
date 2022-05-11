package com.example.finalspringstock.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manager")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private long manager_id;

    @Column(name = "manager_fisrtname")
    private String first_name;

    @Column(name = "manager_lastname")
    private String last_name;

    @Id
    @Column(name = "manager_location_id")
    private long location_id;

    @Column(name = "manager_email")
    private String email;

    @Column(name = "manager_phone")
    private int phone_number;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id_fk")
    private Location location;
}

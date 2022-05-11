package com.example.finalspringstock.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id")
    private long location_id;

    @Column(name = "location_province")
    private String province;

    @Column(name = "location_city")
    private String city;

    @Column(name = "location_street")
    private String street;
}

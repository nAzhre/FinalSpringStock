package com.example.finalspringstock.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customer_id;

    @Column(name = "customer_firstname")
    private String first_name;

    @Column(name = "customer_lastname")
    private String last_name;

    @Column(name = "custome_phone")
    private int phone_number;

}

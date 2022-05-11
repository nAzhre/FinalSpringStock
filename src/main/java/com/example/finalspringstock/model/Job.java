package com.example.finalspringstock.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private long job_id;

    @Column(name = "job_title")
    private String job_title;

    @Column(name = "job_salary")
    private int salary;

}

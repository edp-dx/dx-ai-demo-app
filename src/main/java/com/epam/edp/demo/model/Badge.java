package com.epam.edp.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "badge")
public class Badge {

    @Id
    private Long id;
    private String name;

    // Getters, setters, and toString method omitted for brevity
}
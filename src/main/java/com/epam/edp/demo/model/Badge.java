package com.epam.edp.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "badges")
public class Badge {

    @Id
    private Long id;
    private String name;

    // Getters, setters, and other methods omitted for brevity
}
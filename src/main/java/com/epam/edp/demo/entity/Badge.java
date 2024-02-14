package com.epam.edp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Badge entity with JPA annotations.
 */
@Entity
@Table(name = "badge")
public class Badge {

    @Id
    private Long id;

    // Add other attributes, getters, and setters here

}

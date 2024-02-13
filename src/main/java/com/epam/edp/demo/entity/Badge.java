package com.epam.edp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
// Attribute descriptions as comments
/**
 * Unique identifier of the badge
 */
import javax.persistence.Column;
/**
 * Name of the badge
 */
@Column(nullable = false)
private String name;
/**
 * Description of the badge
 */
private String description;

// Getters and setters for description
public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

/**
 * Badge entity representing a badge.
 */
@Entity
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Getters and setters omitted for brevity

}

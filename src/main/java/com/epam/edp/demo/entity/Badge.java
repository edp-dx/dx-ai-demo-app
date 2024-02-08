package com.epam.edp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Badge entity class with JPA annotations for the attributes.
 */
@Entity
@XmlRootElement
public class Badge {

    @Id
    private Long id;
    // Other attributes, getters, and setters are omitted for brevity.
}
package com.epam.edp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Badge entity representing a badge.
 */
@Entity
public class Badge {

    /**
     * Unique identifier of the badge.
     */
    @Id
    @GeneratedValue
    private Long badgeId;

    // Other attributes along with getters and setters will be here
    // ...

    // Getters and setters for each attribute
    public Long getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Long badgeId) {
        this.badgeId = badgeId;
    }

    // Other getters and setters will be here
    // ...
}

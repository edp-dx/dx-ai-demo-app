package com.epam.edp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Badge {

    /**
     * Unique identifier for the Badge entity.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long badgeId;

    /**
     * Name of the badge.
     */
    private String badgeName;

    /**
     * Description of the badge.
     */
    private String description;

    /**
     * Points required to obtain the badge.
     */
    private Integer pointsRequired;

    /**
     * Image URL for the badge.
     */
    private String badgeImage;

    /**
     * Date and time when the badge was created.
     */
    private LocalDateTime createDate;

    /**
     * Date and time when the badge was last updated.
     */
    private LocalDateTime updateDate;

    // Getters and setters
    public Long getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Long badgeId) {
        this.badgeId = badgeId;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPointsRequired() {
        return pointsRequired;
    }

    public void setPointsRequired(Integer pointsRequired) {
        this.pointsRequired = pointsRequired;
    }

    public String getBadgeImage() {
        return badgeImage;
    }

    public void setBadgeImage(String badgeImage) {
        this.badgeImage = badgeImage;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
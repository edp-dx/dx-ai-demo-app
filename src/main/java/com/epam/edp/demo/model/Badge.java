package com.epam.edp.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import java.util.Date;

@Entity
public class Badge {

    @Id
    @GeneratedValue
    private Long Badge_ID;

    @Column(nullable = false)
    private String Badge_Name;

    private String Description;

    @Column(nullable = false)
    private Integer Points_Required;

    private String Badge_Image;

    @Column(nullable = false)
    private Date Create_Date;

    @Column(nullable = false)
    private Date Update_Date;

    // Getters and Setters
    public Long getBadge_ID() {
        return Badge_ID;
    }

    public void setBadge_ID(Long badge_ID) {
        Badge_ID = badge_ID;
    }

    public String getBadge_Name() {
        return Badge_Name;
    }

    public void setBadge_Name(String badge_Name) {
        Badge_Name = badge_Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getPoints_Required() {
        return Points_Required;
    }

    public void setPoints_Required(Integer points_Required) {
        Points_Required = points_Required;
    }

    public String getBadge_Image() {
        return Badge_Image;
    }

    public void setBadge_Image(String badge_Image) {
        Badge_Image = badge_Image;
    }

    public Date getCreate_Date() {
        return Create_Date;
    }

    public void setCreate_Date(Date create_Date) {
        Create_Date = create_Date;
    }

    public Date getUpdate_Date() {
        return Update_Date;
    }

    public void setUpdate_Date(Date update_Date) {
        Update_Date = update_Date;
    }
}
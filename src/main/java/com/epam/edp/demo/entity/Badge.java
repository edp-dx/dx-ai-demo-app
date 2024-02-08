```java
package com.epam.edp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "badges")
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long badgeId;

    private String badgeName;

    private String description;

    private Integer pointsRequired;

    private String badgeImage;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    // Add getters and setters

    // Add constructors

    // Add toString method

}
```
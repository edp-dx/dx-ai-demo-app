```java
package com.epam.edp.demo.controller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BadgeController {

    @Autowired
    private BadgeService badgeService;

    @GetMapping("/badges")
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }

    // Add more controller methods as needed

}
```
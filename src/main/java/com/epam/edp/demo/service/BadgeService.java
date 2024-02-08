```java
package com.epam.edp.demo.service;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    public List<Badge> getAllBadges() {
        return badgeRepository.findAll();
    }

    // Add more service methods as needed

}
```
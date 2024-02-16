package com.epam.edp.demo.controller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    @GetMapping
    public ResponseEntity<List<Badge>> getAllBadges() {
        List<Badge> badges = badgeService.findAllBadges();
        if (badges.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(badges);
    }
}

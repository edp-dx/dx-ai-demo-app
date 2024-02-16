package com.epam.edp.demo.controller;

import com.epam.edp.demo.domain.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing badges.
 */
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    @GetMapping
    @CrossOrigin
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
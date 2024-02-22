package com.epam.edp.demo.conroller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing badges.
 */
@RestController
@CrossOrigin
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * GET endpoint to retrieve all badges.
     *
     * @return list of badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}
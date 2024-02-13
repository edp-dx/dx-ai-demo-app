package com.epam.edp.demo.controller;

import com.epam.edp.demo.entity.Badge;
import com.epam.edp.demo.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * REST controller for managing badges.
 */
@RestController
@RequestMapping("/badges")
public class BadgeController {

    private final BadgeService badgeService;
    private final Logger log = LoggerFactory.getLogger(BadgeController.class);

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * GET  / : get all badges.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of badges
     */
    @GetMapping
    public ResponseEntity<List<Badge>> getAllBadges() {
        log.info("REST request to get all Badges");
        List<Badge> list = badgeService.getAllBadges();
        return ResponseEntity.ok().body(list);
    }
}

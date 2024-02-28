package com.epam.edp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for application UI entry point.
 */
@RestController
public class AppController {

    /**
     * Endpoint for the BadgesDashboard.
     *
     * @return String indicating the dashboard is up.
     */
    @GetMapping("/")
    public String badgesDashboard() {
        return "BadgesDashboard is up and running!";
    }
}
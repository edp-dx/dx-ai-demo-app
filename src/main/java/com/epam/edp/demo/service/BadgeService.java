package com.epam.edp.demo.service;

import com.epam.edp.demo.model.Badge;
import com.epam.edp.demo.repository.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for managing badges.
 */
@Service
public class BadgeService {

    private final BadgeRepository badgeRepository;

    @Autowired
    public BadgeService(BadgeRepository badgeRepository) {
        this.badgeRepository = badgeRepository;
    }

    /**
     * Fetches all badges from the repository.
     * @return a list of all badges
     */
    public List<Badge> getAllBadges() {
        return badgeRepository.findAll();
    }
}

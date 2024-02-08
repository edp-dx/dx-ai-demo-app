package com.epam.edp.demo.repository;

import com.epam.edp.demo.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BadgeRepository interface for Badge entity.
 */
@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
    // Repository methods can be added here
}

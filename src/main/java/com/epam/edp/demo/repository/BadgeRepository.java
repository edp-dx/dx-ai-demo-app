package com.epam.edp.demo.repository;

import com.epam.edp.demo.model.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Badge entity.
 */
public interface BadgeRepository extends JpaRepository<Badge, Long> {
}

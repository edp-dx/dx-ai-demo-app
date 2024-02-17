package com.epam.edp.demo.repository;

import com.epam.edp.demo.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository for the Badge entity.
 */
@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
    // This will provide basic CRUD operations on Badge entity
}
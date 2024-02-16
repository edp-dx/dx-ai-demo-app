package com.epam.edp.demo.repository;

import com.epam.edp.demo.domain.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
    // Custom methods can be added here
}
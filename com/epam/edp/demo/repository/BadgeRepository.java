package com.epam.edp.demo.repository;

import com.epam.edp.demo.entity.Badge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadgeRepository extends JpaRepository<Badge, Long> {
}

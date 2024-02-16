# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Badge entity class with JPA annotations and corresponding getters and setters.
- Dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist in pom.xml.
- Configuration for H2 database in application.properties.
- data.sql file in resources with initial badge data.
- BadgeRepository interface extending JpaRepository.
- BadgeService class for badge management.
- BadgeController REST controller with a GET endpoint to fetch all badges.

## [0.1.0] - 2023-XX-XX

### Added
- CHANGELOG.md to keep track of changes in the project.

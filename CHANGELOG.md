# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- `Badge` entity class with the necessary JPA annotations and fields such as badgeId, badgeName, description, pointsRequired, badgeImage, createDate, and updateDate.
- Dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist (version 3.23.1-GA) to `pom.xml`.
- Configuration for H2 database to `application.properties`.
- `data.sql` file with hardcoded data for initializing 5 badges.
- `BadgeRepository` interface extending JpaRepository for the `Badge` entity.
- `BadgeService` class for fetching all badges using `BadgeRepository`.
- `BadgeController` with a GET endpoint `"/badges"` and `@CrossOrigin` annotation.

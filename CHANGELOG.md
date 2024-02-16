# Changelog

## [Unreleased]

### Added
- `Badge` entity class with JPA annotations.
- Dependencies for Spring Boot Web, Spring Boot Data JPA, H2 database, JAXB API, and Java Assist in `pom.xml`.
- H2 database configuration in `application.properties`.
- Hardcoded data for 5 badges in `data.sql`.
- `BadgeRepository` interface extending `JpaRepository`.
- `BadgeService` class for fetching all badges from the database.
- `BadgeController` class with GET endpoint to fetch all badges.

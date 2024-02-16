# Changelog

## [Unreleased]

### Added
- `Badge` entity class with attributes and annotations.
- Dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist in `pom.xml`.
- Configuration for H2 database in `application.properties`.
- `data.sql` file with hardcoded data for initializing Badge entities.
- `BadgeRepository` interface extending JpaRepository.
- `BadgeService` class to fetch all badges from the database.
- `BadgeController` REST controller with a GET endpoint to retrieve all badges.

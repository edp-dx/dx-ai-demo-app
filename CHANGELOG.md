# Changelog

## [Unreleased]

### Added
- Created `Badge` entity class with attributes and annotations for JPA.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist.
- Configured H2 database in `application.properties`.
- Added `data.sql` with predefined data for the `Badge` entity.
- Created `BadgeRepository` interface extending `JpaRepository`.
- Created `BadgeService` class for business logic.
- Created `BadgeController` class with a GET endpoint to fetch all badges.

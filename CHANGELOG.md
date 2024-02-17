# Changelog

## [Unreleased]
### Added
- Added new `Badge` entity class with attributes and associated JPA annotations.
- Added new `BadgeRepository` interface extending `JpaRepository`.
- Added new `BadgeService` class to interact with the `BadgeRepository`.
- Added new `BadgeController` class with a GET endpoint to retrieve all badges.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2, jaxb-api, and org.javassist.
- Configured H2 database in `application.properties`.
- Created `data.sql` in resources directory with preloaded badge data.

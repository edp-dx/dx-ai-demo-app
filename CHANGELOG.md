# Changelog

## [Unreleased]

### Added
- Created `Badge` entity class with necessary JPA annotations and fields.
- Added new dependencies to `pom.xml` for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist.
- Configured H2 database in `application.properties`.
- Added `data.sql` with predefined data for the `Badge` entity.
- Created `BadgeRepository` extending JpaRepository for the `Badge` entity.
- Created `BadgeService` to interact with the `BadgeRepository`.
- Created `BadgeController` with a GET endpoint to fetch all badges and added `@CrossOrigin` annotation.

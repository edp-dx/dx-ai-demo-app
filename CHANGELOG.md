# Changelog

## [Unreleased]
### Added
- Added new entity class `Badge`.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist.
- Configured H2 in-memory database in `application.properties`.
- Added `data.sql` file with predefined badges data.
- Created `BadgeRepository` interface extending JpaRepository.
- Created `BadgeService` to fetch all badges from the database.
- Added `BadgeController` with a GET endpoint to return all badges.

## [0.1.0] - 2023-XX-XX

- Incremented minor version in pom.xml.
# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created `Badge` entity class with attributes and JPA annotations.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist.
- Created `data.sql` in resources directory with hardcoded badge data.
- Created `BadgeRepository` interface extending `JpaRepository`.
- Created `BadgeService` class for fetching all badges from the database.
- Created `BadgeController` REST controller with a GET endpoint `/badges`.

### Incomplete
- Configuration of the H2 database in `application.properties` file.

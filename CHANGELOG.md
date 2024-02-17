# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created `Badge.java` in `src/main/java/com/epam/edp/demo/entity/` with attributes and annotations.
- Added dependencies for Spring Boot Web, JPA, H2, JAXB API, and org.javassist to `pom.xml`.
- Configured H2 database in `src/main/resources/application.properties`.
- Created `data.sql` in `src/main/resources/` with hardcoded badges data.
- Created `BadgeRepository.java` in `src/main/java/com/epam/edp/demo/repository/` extending JpaRepository.
- Created `BadgeService.java` in `src/main/java/com/epam/edp/demo/service/` to fetch badges.
- Created `BadgeController.java` in `src/main/java/com/epam/edp/demo/controller/` with a GET endpoint to fetch badges.

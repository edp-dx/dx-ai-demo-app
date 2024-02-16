# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created a new entity class `Badge` in `src/main/java/com/epam/edp/demo/entity/Badge.java`.
- Updated `pom.xml` to include dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and javassist.
- Configured H2 database in `src/main/resources/application.properties`.
- Created `data.sql` in `src/main/resources` with predefined data for 5 badges.
- Created `BadgeRepository` interface in `src/main/java/com/epam/edp/demo/repository/BadgeRepository.java`.
- Created `BadgeService` class in `src/main/java/com/epam/edp/demo/service/BadgeService.java`.
- Created `BadgeController` REST controller in `src/main/java/com/epam/edp/demo/controller/BadgeController.java`.

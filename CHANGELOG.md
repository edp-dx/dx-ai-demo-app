# Changelog

All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created new entity class `Badge` in `src/main/java/com/epam/edp/demo/entity`.
- Added Spring Boot Web, JPA, H2 database, JAXB API, and Java Assist dependencies to `pom.xml`.
- Configured H2 database in `src/main/resources/application.properties`.
- Added `data.sql` in `src/main/resources` with hardcoded data for 5 badges.
- Created repository interface `BadgeRepository` in `src/main/java/com/epam/edp/demo/repository`.
- Created service class `BadgeService` in `src/main/java/com/epam/edp/demo/service` to fetch all badges.
- Created REST controller `BadgeController` in `src/main/java/com/epam/edp/demo/controller` with a GET endpoint to retrieve all badges.
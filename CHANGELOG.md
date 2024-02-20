# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- New entity class `Badge` with necessary JPA annotations, attributes, and corresponding getters and setters.
- New repository interface `BadgeRepository` that extends JpaRepository for the Badge entity.
- New service class `BadgeService` that uses the `BadgeRepository` to fetch all badges from the database.
- New REST controller class `BadgeController` with a GET endpoint at '/badges' that fetches all badges using the `BadgeService`.
- Configuration for the H2 in-memory database in `application.properties`.
- Hardcoded data for five badges in `data.sql`.

### Updated
- `pom.xml` to include dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist with version '3.23.1-GA'.

## [0.2.0] - 2023-04-DD

### Changed
- Incremented MINOR version in pom.xml.

### Added

### Changed

### Deprecated

### Removed

### Fixed

### Security

### Changed
- Incremented MINOR version in pom.xml.

### Added
- Entity class `Badge` with attributes, annotations, and getters/setters.
- Dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist in `pom.xml`.
- H2 database configuration in `application.properties`.
- Hardcoded data for 5 badges in `data.sql`.
- Repository interface `BadgeRepository` for Badge entities.
- Service class `BadgeService` to fetch all badges from the database.
- REST controller `BadgeController` with a GET endpoint to fetch all badges.
- `@CrossOrigin` annotation to the controller class.

## [0.1.0] - 2023-04-DD

### Changed
- Incremented MINOR version in pom.xml.

### Added
- Incremented MINOR version in pom.xml to 0.1.0-SNAPSHOT.

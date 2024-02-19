# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Badge entity with attributes and JPA annotations in `src/main/java/com/epam/edp/demo/entity/Badge.java`.
- Dependencies for Spring Boot Web, JPA, H2, jaxb-api, org.javassist in `pom.xml`.
- H2 database configuration in `src/main/resources/application.properties`.
- Data for badges in `src/main/resources/data.sql`.
- BadgeRepository interface extending JpaRepository in `src/main/java/com/epam/edp/demo/repository/BadgeRepository.java`.
- BadgeService class for fetching all badges from the database in `src/main/java/com/epam/edp/demo/service/BadgeService.java`.
- BadgeController class with GET endpoint to fetch all badges in `src/main/java/com/epam/edp/demo/controller/BadgeController.java`.

## [0.1.0] - 2023-04-DD

### Added
- Incremented MINOR version in pom.xml to 0.1.0-SNAPSHOT.

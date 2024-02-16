# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- New entity class `Badge` under `com.epam.edp.demo.entity` package with fields and JPA annotations.
- Dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist in `pom.xml`.
- H2 database configuration in `application.properties`.
- `data.sql` file in `src/main/resources` with hardcoded data for 5 badges.
- Repository interface `BadgeRepository` extending JpaRepository under `com.epam.edp.demo.repository` package.
- Service class `BadgeService` under `com.epam.edp.demo.service` package to handle badge-related operations.
- REST controller `BadgeController` with a GET endpoint "/badges" under `com.epam.edp.demo.controller` package.

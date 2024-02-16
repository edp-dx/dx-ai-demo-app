# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.1.1] - 2023-XX-XX

### Added
- Created Badge entity with attributes and JPA annotations under `com.epam.edp.demo.model` package.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist version '3.23.1-GA'.
- Configured H2 database properties in `application.properties`.
- Added `data.sql` with predefined data for 5 badges in `src/main/resources`.
- Created BadgeRepository interface extending JpaRepository under `com.epam.edp.demo.repository` package.
- Created BadgeService class in `com.epam.edp.demo.service` package to fetch all badges using the repository.
- Added BadgeController with a GET endpoint to return all badges under `com.epam.edp.demo.controller` package.

## [0.1.0] - 2023-XX-XX

### Added
- CHANGELOG.md to keep track of changes in the project.

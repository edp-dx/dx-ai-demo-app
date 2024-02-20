# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created Badge entity class with JPA annotations and necessary fields.
- Updated pom.xml with dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist.
- Configured H2 in-memory database in application.properties.
- Added data.sql file with predefined records for Badge entity.
- Created BadgeRepository interface extending JpaRepository.
- Created BadgeService class for managing badge data.
- Created BadgeController with a GET endpoint to fetch all badges.

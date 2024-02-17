# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created Badge entity with attributes and JPA annotations.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and javassist.
- Configured H2 database in `application.properties`.
- Added initial data for badges in `data.sql`.
- Created BadgeRepository interface extending JpaRepository.
- Created BadgeService class for fetching badges from the database.
- Created BadgeController with a GET endpoint to retrieve all badges.

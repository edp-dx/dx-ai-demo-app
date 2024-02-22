# Changelog

## [0.1.0] - 2023-XX-XX

- Your list of git commits would go here.

## [0.0.2] - 2023-XX-XX

- Your list of git commits would go here.

## [Unreleased]

- Created Badge entity class with attributes and JPA annotations.
- Updated `pom.xml` to include dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist.
- Configured H2 database in `application.properties`.
- Added `data.sql` with hardcoded data for 5 badges.
- Created BadgeRepository interface extending JpaRepository.
- Created BadgeService class for managing badges.
- Created BadgeController REST controller with a GET endpoint to fetch all badges.

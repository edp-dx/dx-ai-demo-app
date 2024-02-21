# Changelog

## [Unreleased]

- Created Badge entity class with attributes and JPA annotations.
- Updated `pom.xml` to include dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and org.javassist.
- Configured H2 database in `application.properties`.
- Added `data.sql` with hardcoded data for 5 badges.
- Created BadgeRepository interface extending JpaRepository.
- Created BadgeService class for managing badges.
- Created BadgeController REST controller with a GET endpoint to fetch all badges.

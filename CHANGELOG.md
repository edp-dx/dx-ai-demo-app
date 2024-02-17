# Changelog

## [Unreleased]

### Added
- Badge entity class with attributes and JPA annotations.
- New dependencies in pom.xml for Spring Boot Web, JPA, H2, jaxb-api, and org.javassist.
- Configuration properties for H2 database in application.properties.
- Data.sql file with hardcoded badge data.
- BadgeRepository interface extending JpaRepository.
- BadgeService class to fetch all badges.
- BadgeController with a GET endpoint to retrieve all badges.

# Changelog

## [Unreleased]

### Added
- New entity `Badge` with attributes `badgeId`, `badgeName`, `description`, `pointsRequired`, `badgeImage`, `createDate`, and `updateDate`.
- CRUD repository `BadgeRepository` for entity `Badge`.
- Service class `BadgeService` with method `getAllBadges` to fetch all badges from the database.
- REST controller `BadgeController` with GET endpoint `/badges` to retrieve all badges.
- H2 database configuration in `application.properties`.
- Data insertion script `data.sql` in the resources directory with hardcoded badge data.
- Dependencies for Spring Boot Web, JPA, in-memory database H2, JAXB API, and org.javassist in `pom.xml`.

### Fixed
- Branch issues resolved and `ai-engineer/add-badge-entity` set as active branch for changes.

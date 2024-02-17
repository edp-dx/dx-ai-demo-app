# Changelog

## [Unreleased]

### Added
- Created Badge entity class with attributes and methods in `com/epam/edp/demo/model/Badge.java`.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, jaxb-api, and org.javassist.
- Configured H2 database in `src/main/resources/application.properties`.
- Added `data.sql` in `src/main/resources` with hardcoded badge data.
- Created BadgeRepository interface extending JpaRepository in `com/epam/edp/demo/repository/BadgeRepository.java`.
- Implemented BadgeService class in `com/epam/edp/demo/service/BadgeService.java`.
- Created BadgeController REST controller with GET endpoint in `com/epam/edp/demo/controller/BadgeController.java`.
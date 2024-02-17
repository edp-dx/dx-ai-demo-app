# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created Badge entity class with JPA annotations and getter/setter methods (src/main/java/com/epam/edp/demo/entity/Badge.java).
- Updated pom.xml with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and Java Assist (3.23.1-GA).
- Configured H2 database in application.properties.
- Created data.sql in resources directory with predefined data for Badge entities (src/main/resources/data.sql).
- Created BadgeRepository interface that extends JpaRepository (src/main/java/com/epam/edp/demo/repository/BadgeRepository.java).
- Created BadgeService class to manage Badge entities and fetch all badges from the database (src/main/java/com/epam/edp/demo/service/BadgeService.java).
- Created BadgeController with a GET endpoint to retrieve all badges and added CrossOrigin annotation (src/main/java/com/epam/edp/demo/controller/BadgeController.java).

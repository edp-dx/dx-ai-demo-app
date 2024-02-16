# Changelog
All notable changes to this project will be documented in this file.

## [Unreleased]

### Added
- Created `Badge` entity class with all required fields and methods.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and Java Assist.
- Configured H2 database in `application.properties`.
- Added hardcoded data of 5 badges in `data.sql` file.
- Created `BadgeRepository` to handle data operations for `Badge` entity.
- Created `BadgeService` to provide services related to `Badge` entity.
- Created `BadgeController` with a GET endpoint to fetch all badges and enabled Cross-Origin requests.

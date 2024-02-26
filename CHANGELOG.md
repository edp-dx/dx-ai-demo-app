# Changelog

## [Unreleased]
### Added
- Entity class `Badge` with necessary JPA annotations and fields.
- Updated `pom.xml` with dependencies for Spring Boot Web, JPA, H2 database, JAXB API, and Javassist.
- Configuration for H2 database in `application.properties`.
- Data initialization script `data.sql` for the `Badge` entity.
- Repository interface `BadgeRepository` extending JpaRepository.
- Service class `BadgeService` for managing badges.
- REST controller `BadgeController` with `@CrossOrigin` and `@GetMapping` to fetch all badges.

## [0.1.0] - 2023-XX-XX

- Incremented minor version in pom.xml.
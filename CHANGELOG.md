# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [0.1.1] - 2023-04-DD

### Added
- Badge entity class with JPA annotations and corresponding attributes.
- Repository interface for Badge entity extending JpaRepository.
- Service class to interact with Badge repository and fetch all badges.
- REST controller with a GET endpoint to retrieve all badges.
- H2 database configuration in application.properties.
- Initial badge data in data.sql file.
- Updated dependencies in pom.xml for Spring Boot Web, JPA, H2 database, JAXB api, and org.javassist.

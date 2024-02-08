```java
package com.epam.edp.demo.repository;

import com.epam.edp.demo.model.Badge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BadgeRepository interface that extends JpaRepository.
 */
@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
}
```
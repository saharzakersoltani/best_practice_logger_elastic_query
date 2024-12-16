package com.example.audit_log;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyEntityRepository extends JpaRepository<MyEntity, Long> {
    // No additional methods are needed for basic CRUD operations
}

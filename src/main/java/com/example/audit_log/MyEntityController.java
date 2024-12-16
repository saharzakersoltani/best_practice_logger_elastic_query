package com.example.audit_log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 1. Set Up the REST API

@RestController
@RequestMapping("/api/entities")
public class MyEntityController {

    @Autowired
    private MyEntityRepository repository;

    // Create a new entity
    @PostMapping
    public MyEntity createEntity(@RequestBody MyEntity entity) {
        return repository.save(entity);
    }

    // Get all entities
    @GetMapping
    public List<MyEntity> getAllEntities() {
        return repository.findAll();
    }

    // Get a single entity by ID
    @GetMapping("/{id}")
    public ResponseEntity<MyEntity> getEntityById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Update an entity by ID
    @PutMapping("/{id}")
    public ResponseEntity<MyEntity> updateEntity(@PathVariable Long id, @RequestBody MyEntity updatedEntity) {
        return repository.findById(id).map(existingEntity -> {
            existingEntity.setName(updatedEntity.getName()); // Update the name or other fields as needed
            return ResponseEntity.ok(repository.save(existingEntity));
        }).orElse(ResponseEntity.notFound().build());
    }

    // Delete an entity by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}




//http://localhost:8080/api/entities
package com.example.audit_log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private MyEntityRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // Create some sample entities
        MyEntity entity1 = new MyEntity();
        entity1.setName("Sahar");

        MyEntity entity2 = new MyEntity();
        entity2.setName("Sam");

        MyEntity entity3 = new MyEntity();
        entity3.setName("Sarah");

        MyEntity entity4 = new MyEntity();
        entity4.setName("Julia");

        MyEntity entity5 = new MyEntity();
        entity5.setName("Jack");

        MyEntity entity6 = new MyEntity();
        entity6.setName("David");

        MyEntity entity7 = new MyEntity();
        entity7.setName("Ben");

        MyEntity entity8 = new MyEntity();
        entity8.setName("Leo");

        // Save the entities to the database
        repository.save(entity1);
        repository.save(entity2);
        repository.save(entity3);
        repository.save(entity4);
        repository.save(entity5);
        repository.save(entity6);
        repository.save(entity7);
        repository.save(entity8);


        System.out.println("Sample data seeded successfully!");
    }
}

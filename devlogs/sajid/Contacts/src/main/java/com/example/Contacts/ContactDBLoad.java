package com.example.Contacts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContactDBLoad {
    @Bean
    CommandLineRunner initDatabase(ContactRepository repository) {
        return args -> {
            repository.save(new Contact("John Doe", "555-555-5555"));
            repository.save(new Contact("Jane Doe", "555-555-5555"));
        };
    }
}

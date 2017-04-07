package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

    protected StudentApplication() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }

    public static void main(String... args) {
        SpringApplication.run(StudentApplication.class, args);
    }
}

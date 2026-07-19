// Minimal Spring Boot Setup
package org.itic.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    @GetMapping("/api")
    public String index() {
        return "Spring Boot Endpoint Online";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PulseApplication {

    public static void main(String[] args) {
        SpringApplication.run(PulseApplication.class, args);
    }
    @GetMapping
    public String helloWorld() {
        return "hello world";
    }
}

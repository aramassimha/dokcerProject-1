package com.samarait.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot running in Kubernetes!";
    }
    
    @GetMapping("/api/message")
    public String getMessage() {
        return "This is a test API endpoint";
    }

}

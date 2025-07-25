package com.example.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public List<Map<String, String>> getUsers() {
        return List.of(
            Map.of("id", "1", "name", "Alice"),
            Map.of("id", "2", "name", "Bob"),
            Map.of("id", "3", "name", "Charlie")
        );
    }
}


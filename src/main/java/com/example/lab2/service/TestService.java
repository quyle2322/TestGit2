package com.example.lab2.service;

import com.example.lab2.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestService {
    @GetMapping("/test")
    public ResponseEntity<?> doGetData(@RequestParam("name") String name){
        Map<String, String> user = new HashMap<>();
        user.put("name", name);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/test-variable/{age}")
    public ResponseEntity<?> doGetVariable(@PathVariable String age){
        Map<String, String> user = new HashMap<>();
        user.put("age", age);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/test-variable")
    public ResponseEntity<?> doGetObject(@RequestParam("name") String name,
                                         @RequestParam("age") int age){
        User user = new User(name, age);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/test-object")
    public User doGetObject2(@RequestBody User user){
        return user;
    }
}

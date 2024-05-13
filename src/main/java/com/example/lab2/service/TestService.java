package com.example.lab2.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}

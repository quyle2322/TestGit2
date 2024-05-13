package com.example.lab2.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {
    @GetMapping("/test")
    public ResponseEntity<?> doGetData(){

        return ResponseEntity.ok("Hello World");
    }
}

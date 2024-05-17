package com.example.lab2.service;

import com.example.lab2.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestService {
//    @GetMapping("/test")
//    public ResponseEntity<?> doGetData(@RequestParam("name") String name){
//        Map<String, String> user = new HashMap<>();
//        user.put("name", name);
//        return ResponseEntity.ok(name);
//    }
//
//    @GetMapping("/test-variable/{age}")
//    public ResponseEntity<?> doGetVariable(@PathVariable String age){
//        Map<String, String> user = new HashMap<>();
//        user.put("age", age);
//        return ResponseEntity.ok(user);
//    }
//
//    @GetMapping("/test-variable")
//    public ResponseEntity<?> doGetObject(@RequestParam("name") String name,
//                                         @RequestParam("age") int age){
//        User user = new User(name, age,lop);
//        return ResponseEntity.ok(user);
//    }
//    @GetMapping("/getStudentInformation")
//    public ResponseEntity<?> getStudent(User st){
//
//        return ResponseEntity.ok(st);
//    }
@GetMapping("/getStudentInformation")
public ResponseEntity<?> getStudent(User user ) {
    HttpStatus status = HttpStatus.OK;
    Map<String, Object> response = new HashMap<>();
    response.put("status", status.value());
    response.put("message", "successfully");
    response.put("student", user);
    return new ResponseEntity<>(response, status);
}
    @PostMapping("/test-object")
    public ResponseEntity<?> doPostObject(@RequestBody User user) {
        HttpStatus status = HttpStatus.OK;
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("status", status.value());
        responseBody.put("message", "successfully");
        responseBody.put("student", user);
        return new ResponseEntity<>(responseBody, status);
    }
}

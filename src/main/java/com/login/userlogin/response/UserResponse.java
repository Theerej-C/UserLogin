package com.login.userlogin.response;

import com.login.userlogin.model.User;
import com.login.userlogin.service.Implementation.UserServiceImplementation;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserResponse {
    @Autowired
    private UserServiceImplementation serviceImplementation;

    @PostMapping("/create")
    private ResponseEntity<String> create(@RequestBody User user) {
        serviceImplementation.create(user);
        return ResponseEntity.ok("Server Created");
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> deleteServer(@PathVariable("id") Long id) {
        serviceImplementation.delete(id);
        return ResponseEntity.ok("Hi");
    }

    @GetMapping("/test")
    private String test(@RequestParam("id") Long id) {
        return "Hello" + id;
    }
}

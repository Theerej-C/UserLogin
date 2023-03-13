package com.login.userlogin.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.userlogin.model.User;
import com.login.userlogin.service.Implementation.UserServiceImplementation;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/userreg")
public class UserResponse {
    @Autowired
    private UserServiceImplementation serviceImplementation;

    @PostMapping("/create")
    private ResponseEntity<String> create(@RequestBody User user) {
        serviceImplementation.create(user);
        return ResponseEntity.ok("Server Created");
    }

    @GetMapping("/test")
    private String test() {
        return "Hello";
    }
}

package com.login.userlogin.response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.userlogin.model.LoginDetails;
import com.login.userlogin.model.User;
import com.login.userlogin.service.Implementation.UserServiceImplementation;

import lombok.RequiredArgsConstructor;

import java.util.Random;
import java.util.random.RandomGenerator;

@RequiredArgsConstructor
@RequestMapping("/userlogin")
@RestController
public class UserLogin {
    @Autowired
    private UserServiceImplementation serviceImplementation;

    @PostMapping("/login")
    private ResponseEntity<LoginDetails> login(@RequestBody User user) {
        boolean b = serviceImplementation.login(user.getUName(), user.getPassword());
        int rand = RandomGenerator.getDefault().nextInt();
        String s = "";
        int state = 0;
        if(b==true){
            s = "Sucessfully Logged in";
            state = HttpStatus.OK.value();
        }
        else{
            s = "User Not Found";
            state = HttpStatus.FORBIDDEN.value();
        }
        return ResponseEntity.ok(LoginDetails
                .builder()
                .message("Success")
                .status(s)
                .status_no(state)
                .access(b)
                .session_id((long)rand)
                .build()
        );
    }
}

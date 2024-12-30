package com.jsp.SpringSec.controller;


import com.jsp.SpringSec.model.Users;
import com.jsp.SpringSec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usercontroller {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return userService.verify(user);
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        return userService.registre(user);

    }
}

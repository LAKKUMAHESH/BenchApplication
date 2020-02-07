package com.benchforum.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UsersController {

    @GetMapping()
    public String getUser(){
        return "Hello";
    }
}

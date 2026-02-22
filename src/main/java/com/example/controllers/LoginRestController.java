package com.example.controllers;

import com.example.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {
    @Autowired
    LoginService loginService;
    @PostMapping("/login")
    public String login(@RequestBody String jsonPayloadMap)
    {
        boolean result = loginService.authenticateUser();
    }

}

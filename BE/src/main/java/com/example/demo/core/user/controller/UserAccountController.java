package com.example.demo.core.user.controller;

import com.example.demo.core.user.model.response.UserAccountResponse;
import com.example.demo.core.user.service.impl.UserAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*"})
public class UserAccountController {

    @Autowired
    private UserAccountServiceImpl service;

    @GetMapping("/get-account/{id}")
    public UserAccountResponse getOneById() {
        return service.findById(Long.valueOf(1));
    }

}

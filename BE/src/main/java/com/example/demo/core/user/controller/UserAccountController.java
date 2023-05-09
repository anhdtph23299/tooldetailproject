package com.example.demo.core.user.controller;

import com.example.demo.core.user.model.request.UserAccountRequest;
import com.example.demo.core.user.model.response.UserAccountResponse;
import com.example.demo.core.user.service.impl.UserAccountServiceImpl;
import com.example.demo.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/create-accout")
    public Account createAccount(@RequestBody UserAccountRequest userAccountRequest) {
        return null;
    }

}

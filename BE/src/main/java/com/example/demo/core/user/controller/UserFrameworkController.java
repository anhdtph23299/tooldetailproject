package com.example.demo.core.user.controller;

import com.example.demo.core.user.model.request.UserFramworkRequest;
import com.example.demo.core.user.service.impl.UserFrameworkService;
import com.example.demo.entity.Framework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserFrameworkController {

    @Autowired
    private UserFrameworkService userFrameworkService;

    @PostMapping("add")
    public ResponseEntity<Framework> add(@RequestBody UserFramworkRequest request){
       return ResponseEntity.ok(userFrameworkService.addFrameWork(request));
    }

}

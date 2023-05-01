package com.example.demo.core.user.controller;

import com.example.demo.core.common.base.ResponseObject;
import com.example.demo.core.user.model.request.UserFramworkRequest;
import com.example.demo.core.user.service.impl.UserFrameworkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserFrameworkController {

    @Autowired
    private UserFrameworkServiceImpl userFrameworkServiceImpl;

    @PostMapping("add")
    public ResponseObject add(@RequestBody UserFramworkRequest request){
       return new ResponseObject(userFrameworkServiceImpl.addFrameWork(request));
    }

}

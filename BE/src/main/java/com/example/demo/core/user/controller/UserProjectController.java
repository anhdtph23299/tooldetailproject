package com.example.demo.core.user.controller;

import com.example.demo.core.user.model.response.UserFindProjectResponse;
import com.example.demo.core.user.service.UserProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"*"}, maxAge = 4800, allowCredentials = "false")
public class UserProjectController {

    @Autowired
    UserProjectService userProjectService;
    @GetMapping("/findProjectById/{id}")
    public UserFindProjectResponse findProjectById(@PathVariable("id") String id){
            return userProjectService.findProjectById(id);
    }
}

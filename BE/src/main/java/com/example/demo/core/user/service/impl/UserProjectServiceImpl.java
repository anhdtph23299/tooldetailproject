package com.example.demo.core.user.service.impl;

import com.example.demo.core.user.model.response.UserFindProjectResponse;
import com.example.demo.core.user.repository.UserProjectRepository;
import com.example.demo.core.user.service.UserProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProjectServiceImpl implements UserProjectService {
    @Autowired
    UserProjectRepository userProjectRepository;
    @Override
    public UserFindProjectResponse findProjectById(String id) {
        return userProjectRepository.findProjectById(id);
    }

}

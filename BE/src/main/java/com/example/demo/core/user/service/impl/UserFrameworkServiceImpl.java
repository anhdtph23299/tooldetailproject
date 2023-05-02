package com.example.demo.core.user.service.impl;

import com.example.demo.core.user.model.request.UserFramworkRequest;
import com.example.demo.core.user.repository.UserFrameworkRepository;
import com.example.demo.core.user.service.UserFrameService;
import com.example.demo.entity.Framework;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFrameworkServiceImpl implements UserFrameService {

    @Autowired
    private UserFrameworkRepository userFrameworkRepository;
    @Override
    public Framework addFrameWork(UserFramworkRequest request) {
        Framework framework = new Framework();
        framework.setFrameworkName(request.getName());
        return userFrameworkRepository.save(framework);
    }

    @Override
    public List<Framework> getAll() {
        return userFrameworkRepository.findAll();
    }
}

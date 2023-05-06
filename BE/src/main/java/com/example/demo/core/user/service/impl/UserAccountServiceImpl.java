package com.example.demo.core.user.service.impl;

import com.example.demo.core.user.model.request.UserFramworkRequest;
import com.example.demo.core.user.model.response.UserAccountResponse;
import com.example.demo.core.user.model.response.UserFrameworkResponse;
import com.example.demo.core.user.repository.UserAccountRepository;
import com.example.demo.core.user.repository.UserFrameworkRepository;
import com.example.demo.core.user.service.UserAccountService;
import com.example.demo.core.user.service.UserFrameService;
import com.example.demo.entity.Framework;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository repository;

    @Override
    public UserAccountResponse findById(Long id) {
        return repository.findAccountById(id);
    }
}

package com.example.demo.service.impl;

import com.example.demo.entity.Account;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountRepository accountRepository;
    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }
}

package com.example.demo.core.user.service;

import com.example.demo.core.user.model.response.UserAccountResponse;
import com.example.demo.entity.Account;

public interface UserAccountService {

    UserAccountResponse findById(Long id);

}

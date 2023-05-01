package com.example.demo.core.user.service;

import com.example.demo.core.user.model.request.UserFramworkRequest;
import com.example.demo.entity.Framework;
import org.springframework.beans.factory.annotation.Autowired;

public interface UserFrameService {
    Framework addFrameWork(UserFramworkRequest request);
}

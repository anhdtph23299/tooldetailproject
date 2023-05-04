package com.example.demo.core.user.service;


import com.example.demo.core.user.model.response.UserFindProjectResponse;
import org.springframework.data.jpa.repository.Query;

public interface UserProjectService {
    @Query
    UserFindProjectResponse findProjectById(String id);
}

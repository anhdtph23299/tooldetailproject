package com.example.demo.core.user.repository;

import com.example.demo.core.user.model.response.UserFrameworkResponse;
import com.example.demo.repository.FrameworkRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFrameworkRepository extends FrameworkRepository {

    @Query(value = "select fr FROM Framework fr ")
    List<UserFrameworkResponse> getAllFramework();

}

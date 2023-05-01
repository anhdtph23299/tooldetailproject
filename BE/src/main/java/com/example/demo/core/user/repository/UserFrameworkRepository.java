package com.example.demo.core.user.repository;

import com.example.demo.core.user.model.response.UserFrameworkResponse;
import com.example.demo.repositories.FrameworkRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserFrameworkRepository extends FrameworkRepository {

    @Query(value = "select * FROM framework fr ",nativeQuery = true)
    List<UserFrameworkResponse> getAllFramework();
}

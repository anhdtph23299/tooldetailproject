package com.example.demo.core.user.repository;

import com.example.demo.core.user.model.response.UserAccountResponse;
import com.example.demo.repository.AccountRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends AccountRepository {

    @Query("FROM Account acc WHERE acc.id = :Id")
    UserAccountResponse findAccountById(@Param("Id") Long id);



}

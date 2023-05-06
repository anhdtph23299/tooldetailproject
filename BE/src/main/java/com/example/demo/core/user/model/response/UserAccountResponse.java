package com.example.demo.core.user.model.response;

import com.example.demo.entity.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Account.class})
public interface UserAccountResponse {

    @Value("#{target.name}")
    String getName();

    @Value("#{target.email}")
    String getEmail();

    @Value("#{target.phone}")
    String getPhone();

    @Value("#{target.userName}")
    String getUserName();

    @Value("#{target.passwork}")
    String getPasswork();
}

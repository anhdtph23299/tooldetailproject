package com.example.demo.core.user.model.response;

import com.example.demo.entity.Framework;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Date;
import java.util.List;

@Projection(types = {Framework.class})
public interface UserFrameworkResponse {
    @Value("#{target.frameworkName}")
    String getName();
}

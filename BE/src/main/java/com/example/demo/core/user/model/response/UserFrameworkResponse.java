package com.example.demo.core.user.model.response;

import com.example.demo.entity.Framework;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = {Framework.class})
public interface UserFrameworkResponse {
    @Value("#{target.name}")
    String getName();
}

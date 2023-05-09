package com.example.demo.core.user.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserAccountRequest {

    private String name;

    private String userName;

    private String emailAddress;

    private Integer phoneNumber;

    private String password;


}

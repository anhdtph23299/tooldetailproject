package com.example.demo.entity;

import com.example.demo.entity.Account;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class AccountProjectId implements Serializable {

    private Account account;

    private Project project;

}

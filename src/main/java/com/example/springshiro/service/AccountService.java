package com.example.springshiro.service;

import com.example.springshiro.entity.Account;

public interface AccountService {
    public Account findByUsername(String username);
}

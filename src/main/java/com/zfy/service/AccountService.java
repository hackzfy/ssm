package com.zfy.service;

import com.zfy.entity.Account;

import java.util.List;

public interface AccountService {

    List<Account> findAll();

    void saveAccount(Account account);

    void transfer(String sourceName, String targetName, Double money);
}

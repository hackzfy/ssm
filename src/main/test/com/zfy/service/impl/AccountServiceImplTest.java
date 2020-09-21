package com.zfy.service.impl;

import com.zfy.entity.Account;
import com.zfy.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class AccountServiceImplTest {

    @Autowired
    private AccountService service;

    @Test
    public void findAll() {
        service.findAll();
    }

    @Test
    public void saveAccount() {

        service.saveAccount(new Account());
    }
}
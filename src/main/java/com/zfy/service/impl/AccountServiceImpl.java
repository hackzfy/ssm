package com.zfy.service.impl;

import com.zfy.dao.AccountDao;
import com.zfy.entity.Account;
import com.zfy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        System.out.println("service: findAll runs...");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("service: saveAccount runs...");
        accountDao.saveAccount(account);
    }

    @Override
    public void transfer(String sourceName, String targetName, Double money) {
        Account source = accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targetName);
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);
        accountDao.updateAccount(source);
        int i = 1 / 0;
        accountDao.updateAccount(target);

    }
}

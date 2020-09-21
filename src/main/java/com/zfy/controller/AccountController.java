package com.zfy.controller;

import com.zfy.entity.Account;
import com.zfy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("controller: findAll runs...");
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "list";
    }


    @RequestMapping("/saveAccount")
    public String saveAccount(@RequestParam("name") String name, @RequestParam("money") Double money) {
        System.out.println("controller: saveAccount runs...");
        Account account = new Account();
        account.setName(name);
        account.setMoney(money);
        accountService.saveAccount(account);
        return "forward:/account/findAll";
    }

    @RequestMapping("/transfer")
    public String transfer(String sourceName, String targetName, Double money) {
        accountService.transfer(sourceName, targetName, 100d);
        return "success";
    }
}

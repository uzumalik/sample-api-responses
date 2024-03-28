package com.uzu.controller;

import com.uzu.model.response.Account;
import com.uzu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mohammad Uzair
 **/

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;


    @GetMapping("/{userId}")
    public List<Account> getAccounts(@PathVariable("userId") Long userId){
        if (userId == 101){
            throw new RuntimeException("not allowed");
        }
        return accountService.getAccounts(userId);
    }

}

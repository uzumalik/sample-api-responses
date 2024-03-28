package com.uzu.service.impl;

import com.uzu.model.response.Account;
import com.uzu.persitence.AccountRepository;
import com.uzu.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mohammad Uzair
 **/

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {


    @Autowired
    private AccountRepository repository;

    @Override
    public List<Account> getAccounts(Long userId) {
        log.info("trying to get accounts for the user {}",userId);
        return repository.findById(userId);
    }
}

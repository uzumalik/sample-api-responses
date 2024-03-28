package com.uzu.service;

import com.uzu.model.response.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAccounts(Long userId);
}

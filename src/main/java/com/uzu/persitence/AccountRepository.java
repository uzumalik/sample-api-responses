package com.uzu.persitence;

import com.uzu.constants.AccountType;
import com.uzu.model.response.Account;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mohammad Uzair
 **/
@Repository
public class AccountRepository {

    private List<Account> accountList;

    @PostConstruct
    private void initialize(){
        accountList = Arrays.asList(
                Account.builder()
                        .userId(100L)
                        .accountNumber(200001L)
                        .accountType(AccountType.SAVING)
                        .balance(30000.40)
                        .build(),
                Account.builder()
                        .userId(100L)
                        .accountNumber(200002L)
                        .accountType(AccountType.CURRENT)
                        .balance(300.0)
                        .build(),
                Account.builder()
                        .userId(101L)
                        .accountNumber(200003L)
                        .accountType(AccountType.SAVING)
                        .balance(30000.40)
                        .build(),
                Account.builder()
                        .userId(102L)
                        .accountNumber(200004L)
                        .accountType(AccountType.CURRENT)
                        .balance(3000.40)
                        .build()
        );
    }

    public List<Account> findById(Long userId){
        return accountList
                .stream()
                .filter( account -> account.getUserId().equals(userId))
                .collect(Collectors.toList());
    }
}

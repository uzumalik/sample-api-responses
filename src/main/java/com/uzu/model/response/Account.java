package com.uzu.model.response;

import com.uzu.constants.AccountType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Mohammad Uzair
 **/
@Getter
@Setter
@Builder
public class Account {

    private Long userId;

    private Long accountNumber;

    private AccountType accountType;

    private Double balance;


}


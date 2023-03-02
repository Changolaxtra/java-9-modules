package com.dan.bank.dto;

import lombok.Value;

@Value
public class CreditBankCard extends BankCard {

    public CreditBankCard(String number, User user){
        super(number, user);
    }
}

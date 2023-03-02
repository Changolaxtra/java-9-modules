package com.dan.bank.dto;

import lombok.Value;

@Value
public class DebitBankCard extends BankCard {

    public DebitBankCard(String number, User user){
        super(number, user);
    }

}

package com.dan.bank.cloud;

import com.dan.bank.api.BankCardService;
import com.dan.bank.dto.BankCard;
import com.dan.bank.dto.BankCardType;
import com.dan.bank.dto.User;
import com.dan.bank.factory.BankCardFactory;

public class DefaultBankCardService implements BankCardService {

    @Override
    public BankCard createBankCard(User user, BankCardType type) {
        return new BankCardFactory().getBankCard(user, type);
    }

}

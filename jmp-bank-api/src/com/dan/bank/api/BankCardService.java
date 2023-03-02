package com.dan.bank.api;

import com.dan.bank.dto.BankCard;
import com.dan.bank.dto.BankCardType;
import com.dan.bank.dto.User;

public interface BankCardService {
    BankCard createBankCard(User user, BankCardType type);
}

package com.dan.bank.service.api;

import com.dan.bank.dto.BankCard;
import com.dan.bank.dto.Subscription;
import com.dan.bank.dto.User;

import java.util.List;
import java.util.Optional;

public interface Subscriber {
    void subscribe(BankCard bankCard);
    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);
    List<User> getAllUsers();
}

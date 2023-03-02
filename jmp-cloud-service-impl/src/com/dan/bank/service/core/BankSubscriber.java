package com.dan.bank.service.core;

import com.dan.bank.dto.BankCard;
import com.dan.bank.dto.Subscription;
import com.dan.bank.dto.User;
import com.dan.bank.service.api.Subscriber;
import com.dan.bank.service.data.BankRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BankSubscriber implements Subscriber {

    private final BankRepository bankRepository = BankRepository.getInstance();

    @Override
    public void subscribe(final BankCard bankCard) {
        bankRepository.saveBankCard(bankCard);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(final String cardNumber) {
        Subscription subscription = null;
        if (bankRepository.getBankCard(cardNumber) != null) {
            subscription = new Subscription(cardNumber, LocalDate.now());
        }
        return Optional.ofNullable(subscription);
    }

    @Override
    public List<User> getAllUsers() {
        return Optional.ofNullable(bankRepository.getAllBankCards())
                .orElse(new ArrayList<>())
                .stream()
                .map(BankCard::getUser)
                .collect(Collectors.toUnmodifiableList());
    }
}

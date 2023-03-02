package com.dan.bank.service.data;

import com.dan.bank.dto.BankCard;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class BankRepository {

    private static BankRepository instance = null;

    private ConcurrentHashMap<String, BankCard> cardNumberToBankCardMap;

    private BankRepository() {
        cardNumberToBankCardMap = new ConcurrentHashMap<>();
    }

    public static BankRepository getInstance() {
        synchronized (BankRepository.class) {
            if (instance == null) {
                instance = new BankRepository();
            }
            return instance;
        }
    }

    public void saveBankCard(final BankCard bankCard) {
        cardNumberToBankCardMap.put(bankCard.getNumber(), bankCard);
    }

    public BankCard getBankCard(final String cardNumber) {
        return cardNumberToBankCardMap.get(cardNumber);
    }

    public List<BankCard> getAllBankCards() {
        return cardNumberToBankCardMap.values()
                .stream().collect(Collectors.toUnmodifiableList());
    }
}

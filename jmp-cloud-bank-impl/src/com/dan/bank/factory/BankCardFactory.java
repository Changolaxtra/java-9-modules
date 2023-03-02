package com.dan.bank.factory;

import com.dan.bank.dto.*;
import org.apache.commons.lang3.RandomStringUtils;

public class BankCardFactory {

    private static final String DEBIT_PREFIX = "4422";
    private static final String CREDIT_PREFIX = "5422";

    public BankCard getBankCard(final User user, final BankCardType type) {
        final String numberPostfix = RandomStringUtils.randomNumeric(12);
        BankCard bankCard = null;
        switch (type) {
            case CREDIT:
                bankCard = new CreditBankCard(CREDIT_PREFIX + numberPostfix, user);
                break;
            case DEBIT:
                bankCard = new DebitBankCard(DEBIT_PREFIX + numberPostfix, user);
                break;
        }
        return bankCard;
    }
}

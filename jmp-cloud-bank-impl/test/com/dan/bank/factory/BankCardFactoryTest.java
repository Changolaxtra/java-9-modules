package com.dan.bank.factory;

import com.dan.bank.dto.BankCard;
import com.dan.bank.dto.BankCardType;
import com.dan.bank.dto.User;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class BankCardFactoryTest {

    private static final String DEBIT_PREFIX = "4422";
    private static final String CREDIT_PREFIX = "5422";

    private BankCardFactory bankCardFactory;
    private User user;

    @Before
    public void setUp() {
        bankCardFactory = new BankCardFactory();
        user = new User("John", "Doe", LocalDate.now());
    }


    @Test
    public void testGetDebitCard() {
        //Act
        final BankCard bankCard = bankCardFactory.getBankCard(user, BankCardType.DEBIT);

        //Assert
        assertBankCard(DEBIT_PREFIX, bankCard);
    }

    @Test
    public void testGetCreditCard() {
        //Act
        final BankCard bankCard = bankCardFactory.getBankCard(user, BankCardType.CREDIT);

        //Assert
        assertBankCard(CREDIT_PREFIX, bankCard);
    }

    private void assertBankCard(final String prefix, BankCard bankCard){
        assertNotNull(bankCard);
        assertTrue(StringUtils.isNotEmpty(bankCard.getNumber()));
        assertTrue(bankCard.getNumber().startsWith(prefix));
        assertEquals(16, bankCard.getNumber().length());
        assertNotNull(bankCard.getUser());
    }

}
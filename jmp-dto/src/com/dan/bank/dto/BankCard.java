package com.dan.bank.dto;

import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public class BankCard {
    String number;
    User user;
}

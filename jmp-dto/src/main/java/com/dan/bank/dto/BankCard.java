package com.dan.bank.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankCard {
    String number;
    User user;
}

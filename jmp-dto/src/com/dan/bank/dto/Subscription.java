package com.dan.bank.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

import java.time.LocalDate;

@Value
@AllArgsConstructor
public class Subscription {
    String bankcard;
    LocalDate startDate;
}

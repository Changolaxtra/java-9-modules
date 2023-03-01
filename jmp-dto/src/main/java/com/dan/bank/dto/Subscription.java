package com.dan.bank.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class Subscription {
    String bankcard;
    LocalDate startDate;
}

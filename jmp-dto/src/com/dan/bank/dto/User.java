package com.dan.bank.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class User {
    String name;
    String surname;
    LocalDate birthday;
}

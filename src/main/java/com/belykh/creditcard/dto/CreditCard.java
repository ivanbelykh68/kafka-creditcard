package com.belykh.creditcard.dto;

import java.time.LocalDate;

public record CreditCard (String fullName, long cardNumber, LocalDate expDate, short secCode) {
}

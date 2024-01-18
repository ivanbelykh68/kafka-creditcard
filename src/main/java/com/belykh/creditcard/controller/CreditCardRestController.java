package com.belykh.creditcard.controller;

import com.belykh.creditcard.dto.CreditCard;
import com.belykh.creditcard.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
public class CreditCardRestController {

    private final CreditCardService creditCardService;

    @PostMapping
    public void sendCreditCard(@RequestBody CreditCard creditCard) {
        creditCardService.send(creditCard);
    }
}

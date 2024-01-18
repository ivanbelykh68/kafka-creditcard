package com.belykh.creditcard.service;

import com.belykh.creditcard.dto.CreditCard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CreditCardConsumer {

  @KafkaListener(topics = "${app.kafka.creditcard.topic}")
  public void onMessage(CreditCard creditCard) {
    log.info("Received credit card: {}", creditCard);
  }


}


package com.belykh.creditcard.service;

import com.belykh.creditcard.dto.CreditCard;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CreditCardService {

  private final KafkaTemplate<String, CreditCard> creditCardKafkaTemplate;

  @Value("${app.kafka.creditcard.topic}")
  private String topic;

  public void send(@NonNull CreditCard creditCard) {
    creditCardKafkaTemplate.send(topic, creditCard);
    log.info("Sent {} to topic {}", creditCard, topic);
  }

}

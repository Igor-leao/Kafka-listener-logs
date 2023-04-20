package com.igor.strproducer.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;
@Log4j2
@Service
public class StringProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    StringProducerService (KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        log.info("Send message {}", message);
        kafkaTemplate.send("str-topic", message);

    }

}

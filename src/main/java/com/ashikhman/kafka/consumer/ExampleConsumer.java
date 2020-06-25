package com.ashikhman.kafka.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

/**
 * Example topic consumer.
 */
@Service
@Log4j2
public class ExampleConsumer {

    /**
     * Receives topic messages.
     *
     * @param message   topic message
     * @param partition partition number
     */
    @KafkaListener(topics = "example", groupId = "foo")
    public void listen(@Payload String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
        log.error("Received message: {} with partition {}", message, partition);
    }
}

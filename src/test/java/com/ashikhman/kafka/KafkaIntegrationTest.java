package com.ashikhman.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class KafkaIntegrationTest {

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;

    @Test
    public void givenMessage_whenSend_thenSuccess() {
        kafkaTemplate.send("example", "some message");
    }

    
}

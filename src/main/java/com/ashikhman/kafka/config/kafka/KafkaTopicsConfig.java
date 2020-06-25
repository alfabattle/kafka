package com.ashikhman.kafka.config.kafka;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

import java.util.HashMap;

/**
 * Kafka topics auto creation beans.
 */
@Configuration
@RequiredArgsConstructor
public class KafkaTopicsConfig {

    /**
     * Kafka configuration properties.
     */
    private final KafkaProperties properties;

    /**
     * Kafka administration bean for topic creation.
     *
     * @return kafka administration bean
     */
    @Bean
    public KafkaAdmin kafkaAdmin() {
        var configs = new HashMap<String, Object>();
        configs.put(AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, properties.getBootstrapServers());

        return new KafkaAdmin(configs);
    }

    /**
     * Example Kafka topic.
     *
     * @return new topic
     */
    @Bean
    public NewTopic exampleTopic() {
        return new NewTopic("example", 1, (short) 1);
    }
}

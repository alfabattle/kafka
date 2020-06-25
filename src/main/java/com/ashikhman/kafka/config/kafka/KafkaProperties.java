package com.ashikhman.kafka.config.kafka;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotBlank;

/**
 * Configuration properties for Kafka.
 */
@ConfigurationProperties(prefix = "app.kafka")
@Component
@Data
public class KafkaProperties {

    /**
     * Kafka host.
     */
    @NotBlank
    private String bootstrapServers;

    /**
     * Consumers group id.
     */
    @NotBlank
    private String groupId;
}

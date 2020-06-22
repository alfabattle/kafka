package com.ashikhman.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The application main class.
 */
@SpringBootApplication
public class KafkaApplication {

    /**
     * The entry point of the application.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class);
    }
}

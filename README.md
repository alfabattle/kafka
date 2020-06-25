# Description

Kafka example application.

# Setup local environment

1. Copy `.env.dist` file to `.env.` and optionally make configuration changes.
1. Run `docker-compose up -d`. Be patient it takes some time on first run.

# Useful commands

## Common

1. Building for production

        ./gradlew build

1. Update dependencies

        ./gradlew clean resolveAndLockAll --write-locks

## Kafka

1. List topics 
        
        bin/kafka-topics.sh --list
1. Create a topic

        bin/kafka-topics.sh --create --replication-factor 1 --partitions 1 --topic example

1. Produce topic messages

        bin/kafka-console-producer.sh --topic example

1. Consume topic message

        bin/kafka-console-consumer.sh --topic example

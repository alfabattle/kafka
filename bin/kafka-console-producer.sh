#!/usr/bin/env bash
docker-compose exec -T kafka /opt/bitnami/kafka/bin/kafka-console-producer.sh --bootstrap-server kafka:9092 "$@"

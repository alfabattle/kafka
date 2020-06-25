#!/usr/bin/env bash
docker-compose exec -T kafka /opt/bitnami/kafka/bin/kafka-topics.sh --zookeeper zookeeper:2181 "$@"

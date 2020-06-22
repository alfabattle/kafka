# Description

Kafka example application.

# Setup local environment

1. Copy `.env.dist` file to `.env.` and make necessary configuration changes (not needed).
1. Run `docker-compose up -d`. Be patient it takes some time on first run.

# Updating dependencies

1. Run `./gradlew clean resolveAndLockAll --write-locks`.

# Building for production

1. Run `./gradlew build`.

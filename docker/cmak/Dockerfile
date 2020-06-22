FROM openjdk:11.0-jdk AS build

ENV CMAK_VERSION=3.0.0.5

RUN wget "https://github.com/yahoo/CMAK/archive/${CMAK_VERSION}.tar.gz"

RUN tar -xzf ${CMAK_VERSION}.tar.gz \
    && cd CMAK-${CMAK_VERSION} \
    && ./sbt clean dist \
    && unzip -d ./builded ./target/universal/cmak-${CMAK_VERSION}.zip \
    && mv -T ./builded/cmak-${CMAK_VERSION} /opt/cmak

FROM openjdk:11.0-jdk-slim

COPY --from=build /opt/cmak /opt/cmak
WORKDIR /opt/cmak

EXPOSE 9000
ENTRYPOINT ["./bin/cmak","-Dconfig.file=conf/application.conf"]

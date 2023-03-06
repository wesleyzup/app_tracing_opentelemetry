#OFFICIAL docker-hub image eclipse-temuriun for Java 8
FROM eclipse-temurin:8

RUN apt-get update && apt-get -y install curl
RUN mkdir app

ADD target/newtest-*-final.jar ./app/springApp.jar
ADD docker_entrypoint .

ENTRYPOINT ["/bin/sh", "docker_entrypoint"]
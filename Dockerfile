FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY /target/item-0.0.1-SNAPSHOT.jar item.jar
ENTRYPOINT ["java","-jar","/item.jar"]
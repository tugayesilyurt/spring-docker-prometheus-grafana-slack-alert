FROM maven:3.6.3 AS maven
LABEL MAINTAINER="htyesilyurt@gmail.com"

WORKDIR /opt/spring-slack-example
COPY . /opt/spring-slack-example
RUN mvn clean install 

# For Java 11, 
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=spring-slack-example.jar

WORKDIR /opt/spring-slack-example

COPY --from=maven /opt/spring-slack-example/target/${JAR_FILE} /opt/spring-slack-example/

ENTRYPOINT ["java","-jar","spring-slack-example.jar"]
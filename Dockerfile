FROM openjdk:8-alpine

ARG JAR_FILE=./target/*.jar

WORKDIR /app

USER app

COPY target/bakery.jar /app

CMD ["java", "-Dspring.profiles.active=docker", "-jar"]

EXPOSE 8080 9010 10000


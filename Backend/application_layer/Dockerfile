FROM maven:3.5-jdk-8 AS build
LABEL authors="subodhgujar"

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean install

RUN mvn package

FROM openjdk:8-alpine

COPY --from=build /src/app/target/*.jar app.jar

EXPOSE 9090

ENTRYPOINT ["java","-jar","app.jar"]
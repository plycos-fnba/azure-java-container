FROM maven:3-eclipse-temurin-21

WORKDIR /app
COPY pom.xml /app/pom.xml
COPY src /app/src

RUN mvn clean package

CMD ["java", "-jar", "target/run.jar"]
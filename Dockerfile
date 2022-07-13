FROM maven:3.8.6-openjdk-11-slim as build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -Pdev -f /home/app/pom.xml clean install

FROM openjdk:11-jdk-slim
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar", "-Dspring.profiles.active=prod", "/usr/local/lib/app.jar"]

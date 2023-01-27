FROM openjdk:11
ARG WAR_FILE=target/*.jar
COPY target/you-booking-Docker.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]
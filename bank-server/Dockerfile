FROM amazoncorretto:21-alpine-jdk
COPY target/*.jar bank-server.jar
ENTRYPOINT ["java","-jar","/bank-server.jar"]
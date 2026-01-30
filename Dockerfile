FROM eclipse-temurin:21-jre

WORKDIR /app
COPY target/*.jar app.jar

ENV APP_VERSION=dev
EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
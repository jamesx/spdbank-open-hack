FROM maven:3.6.1 AS build
WORKDIR /app
ADD ./pom.xml /app/pom.xml
ADD ./src /app/src/
RUN mvn clean package -Dmaven.test.skip=true


FROM openjdk:8-jre-alpine
COPY --from=build /app/target/*.jar   /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

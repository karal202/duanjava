FROM  maven:3.9.12-eclipse-temurin-21 as build
WORKDIR /app
COPY . .
RUN mvn package -DskipTests
EXPOSE 8080

FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

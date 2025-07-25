# Use official OpenJDK runtime base image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy built jar file into the image
COPY target/user-service-1.0.0.jar app.jar

# Expose port that Spring Boot listens on
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]


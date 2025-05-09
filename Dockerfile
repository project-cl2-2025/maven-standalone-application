# Use a minimal Java runtime image
FROM openjdk:17-jdk-slim

# Set work directory
WORKDIR /app

# Copy the JAR file
COPY target/maven-stanalone-application-0.0.1-SNAPSHOT.jar app.jar

# Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]


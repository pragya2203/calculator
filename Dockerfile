# Start with a lightweight Java 17 (or 11) base image
FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file (which will be built in the 'target' folder) into the image
# We rename it to app.jar for a simple, consistent name.
COPY target/QTIMEGAN-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9090

# Tell Docker to run this command when the container starts
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
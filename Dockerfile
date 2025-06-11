# Use a lightweight JDK base image
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy Maven wrapper and make it executable
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# ✅ Make the Maven wrapper executable
RUN chmod +x mvnw

# Build dependencies
RUN ./mvnw dependency:go-offline -B

# Copy the rest of the application
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Run the app
CMD ["java", "-jar", "target/DemoTest-0.0.1-SNAPSHOT.jar"]

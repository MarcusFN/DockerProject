FROM tomcat:11.0-jdk17

RUN apt-get update && apt upgrade -y

RUN apt-get install -y \
    mysql-server \
    maven

# Set the working directory to /app
WORKDIR /app

COPY src/ /app/src/

# Copy the jar file from the Java project to the container
COPY target/superheltev4-0.0.1-SNAPSHOT.jar app.jar

# Copy the MariaDB deployment script to the container
COPY superheroes-create.sql /docker-entrypoint-initdb.d/

# Expose port 8080 for the Java app and port 3306 for MariaDB
EXPOSE 8080 3306

# Start MariaDB and the Java app
CMD ["sh", "-c", "service mysql start && java -jar app.jar"]

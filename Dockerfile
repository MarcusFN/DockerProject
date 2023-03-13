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

# Copy the MySQL deployment script to the container
COPY superheroes-create.sql /docker-entrypoint-initdb.d/

# Expose port 8080 for the Java app and port 3306 for MySQL
EXPOSE 8080 3306

# Start MySQL and the Java app
CMD ["sh", "-c", "service mysql start && mysql -uroot -ppassword < /docker-entrypoint-initdb.d/superheroes-create.sql && java -jar -Dspring.config.location=file:/app/src/main/resources/application.properties app.jar"]

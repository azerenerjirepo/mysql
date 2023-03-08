# Use an official openjdk 17 as the base image
FROM openjdk:17-jdk

# Set the working directory in the container to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . /app

# Compile and package the Java code into a JAR file
#RUN javac mysql.java
#RUN jar cfe mysql.jar mysql *.class

# Specify the command to run when the container starts
CMD ["java", "-jar", "mysql.jar"]

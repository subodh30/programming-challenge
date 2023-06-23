# Deployment Guide

This guide provides instructions on how to deploy and run both a Spring Boot application and a React application in Docker containers.

## Prerequisites

Before proceeding with the deployment, ensure that the following prerequisites are met:

- Docker is installed on your machine. You can download Docker from the official website: [https://www.docker.com/](https://www.docker.com/)

## Steps to Deploy

Follow these steps to deploy the Spring Boot and React applications in Docker:

### Step 1: Build the Spring Boot Application Docker Image

1. Open a terminal or command prompt.
2. Navigate to the root directory of the Spring Boot application.
3. Build the Docker image by running the following command:

   ```console
   docker build -t my-springboot-app .
   ```
This command will build a Docker image for the Spring Boot application using the Dockerfile specified in the project.

### Step 2: Build the React Application Docker Image
1. Open a terminal or command prompt. 
2. Navigate to the root directory of the React application. 
3. Build the Docker image by running the following command:

   ```console
   docker build -t my-react-app .
   ```
This command will build a Docker image for the React application using the Dockerfile specified in the project.

### Step 3: Run the Spring Boot Application Container
1. Open a terminal or command prompt. 
2. Run the Spring Boot application container by executing the following command:
 
   ```console
   docker run -p 9090:9090 my-springboot-app
   ```
This command starts a container from the Spring Boot application image and maps port 9090 from the container to port 9090 on your host machine. 

### Step 4: Run the React Application Container
1. Open a terminal or command prompt. 
2. Run the React application container by executing the following command:
    
    ```consol
    docker run -p 8080:8080 my-react-app
    ```
This command starts a container from the React application image and maps port 8080 from the container to port 8080 on your host machine. 

### Step 5: Access the Applications
Once both containers are running, you can access the Spring Boot application at http://localhost:9090.
You can access the React application at http://localhost:8080.
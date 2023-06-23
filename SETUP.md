# Setup Guide

This guide provides instructions on how to set up the project.

## Prerequisites

Before proceeding with the setup, ensure that you have the following prerequisites installed on your system:

- Java Development Kit (JDK) 1.8
- Maven 3.8.4 or higher
- Node.js (v16.17.0 or higher)
- npm (v8.19.2 or higher)
- MySQL server (v8.0.26 or higher)
- Your preferred Integrated Development Environment (IDE) (e.g., IntelliJ IDEA, Eclipse, etc.)

## Backend Setup Steps

Follow the steps below to install and set up the application_layer project:

1. Clone the project repository to your local machine:
```console
git clone https://github.com/subodh30/programming-challenge.git
```
2. Navigate to the project directory:
```console
cd ./Backend/application_layer
```
2. Build the project using Maven. Run the following command in the application_layer directory:
```console
mvn clean install
```
This command will download the project dependencies, compile the source code, run tests, and create the necessary build artifacts.

3. Configure backend database connection settings as given in the next section.
4. Run the project using the following command:
```console
mvn spring-boot:run
```
This will start the application and make it accessible at `http://localhost:9090`.

## Backend Configuration

1.  You can modify the project configuration by editing the `application.yml` file located in the `src/main/resources` directory. To change the database connection settings like username and password, edit the `spring.datasource` properties in the `application.yml` file.
2. For running first time, please set `sql.init.mode` to `always` in `application.yml` file. This will create the database schema, required tables and populate it with initial data from `src/main/resources/schema.sql` and `src/main/resources/data.sql`.
3. After running the project first time, please set `sql.init.mode` to `none` in `application.yml` file. This will prevent the database schema and tables from being dropped and recreated every time the application is started.
4. To change the server port number, edit the `server.port` property in the `application.yml` file. Make sure you change port in React port also in `src/services/HttpService.tsx` file.


## Frontend Setup Steps

1. Navigate to the project directory:
```console
cd ./Frontend/presentation_layer
```

2. Install the project dependencies in presentation_layer using npm
```console
npm install
```
3. Run the project using the following command:
```console
npm run dev
```
This will start the application and make it accessible at `http://localhost:8080`.

## Frontend Configuration
1. To change the server port number, edit the `server.port` property in the `vite.config.ts` file.
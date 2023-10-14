# Praticando DesignPatterns

## Overview
This project is a practical exploration of design patterns, with a focus on consuming the ViaCEP API to automatically populate user addresses based on their postal code (CEP). The project is built using the Spring Boot framework and incorporates Spring Cloud Feign for API consumption.

## Technologies Used
- Java 17
- Spring Boot 3.1.4
- Spring Cloud Feign 2022.0.4
- PostgreSQL (as a database)
- Lombok for streamlined code

## Getting Started

### Prerequisites
- Java 17 installed
- Docker and Docker Compose installed

### Running the Application

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/nicolasjandre/design-patterns.git
   cd design-patterns
   
2. **Build the Project:**
   ```bash
   mvn clean install

3. **Run Docker Compose:**
   ```bash
    docker-compose up -d

4. **Run the Spring Boot Application:**
    ```bash
    java -jar target/design-patterns-0.0.1-SNAPSHOT.jar
    
The application should now be running on [http://localhost:8080](http://localhost:8080).

## API Endpoint

- **GET /api/user/{cep}**
  - Retrieves user information based on the provided CEP (postal code).

  Example:
  ```bash
    curl http://localhost:8080/api/users/12345678

## Database Configuration
The project uses PostgreSQL as its database. You can access the database with the following credentials:

- **Database Name:** design-patterns
- **Username:** postgres
- **Password:** 123456

### Running with Docker Compose

To start the application with Docker Compose, run the following command:

    docker compose up -d

This command will initiate the Docker containers, including the PostgreSQL database.

## Stopping the Application
To stop the application and associated Docker containers, run:

    docker compose down

### Accessing PostgreSQL Database

You can access the PostgreSQL database using your preferred database client or by connecting directly to the container. Use the following details:

- **Host:** get the docker ipv4 with docker inspect container_id command
- **Port:** 5432
- **Database Name:** design-patterns
- **Username:** postgres
- **Password:** 123456

#### Using a Database Client

1. Open your database client.
2. Connect to the PostgreSQL database using the provided credentials.

#### Connecting to the Container

If you prefer to connect directly to the container, you can use the following command:

    psql -h docker_container_ipv4 -p 5432 -d design_patterns -U user -W

You will be prompted to enter the password, which is 'password'.

### Database Schema

The project utilizes a specific database schema for storing user information. If you want to explore the schema or execute SQL queries, here's an overview:

#### User Table

- **Table Name:** user
- **Columns:**
  - id (Primary Key)
  - name
  - address

Feel free to explore and modify the database schema and data as needed for your use case. If you have any specific tasks or queries you'd like to perform, let me know, and I can provide further guidance!

### Running SQL Queries

Once connected to the database, you can run SQL queries. For example, to retrieve all users, you can use:

    SELECT * FROM user;

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

Feel free to explore and modify the codebase as needed. If you have any questions or suggestions, don't hesitate to reach out!
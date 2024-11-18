# MyBanque

## Description
MyBanque is a Spring Boot application that provides a RESTful API for managing bank accounts. It demonstrates the use of Spring Boot, JPA, Jersey, H2 database, and Jakarta XML Bind for building a robust web service.

## Features
- Create, read, update, and delete (CRUD) operations for bank accounts.
- Supports JSON and XML responses.
- Prepopulated H2 in-memory database with sample data for testing.
- Organized project structure following modern software design principles.

## Technologies Used
- Java 21
- Spring Boot 3.3.5
- Spring Data JPA
- Jersey (JAX-RS implementation)
- H2 Database (in-memory)
- Lombok
- Jakarta XML Bind (JAXB)
- Dotenv for environment variable management

## Prerequisites
- Java 21 or higher
- Maven

## Installation and Running

1. Clone the repository:
   ```bash
   git clone https://github.com/your-repository/mybanque.git
   ```
2. Navigate to the project directory:
   ```
   cd mybanque
   ```
3. Build and run the application:
   ```
   mvn spring-boot:run
   ```
4. The application will start on port **8082** by default. You can access the API at:
   ```
   http://localhost:8082
   ```
## API Endpoints
### Base Path: **/banque**
Get All Accounts
  - GET **/banque/comptes**
  - Response: JSON or XML list of accounts.
Get Account by ID
  - GET **/banque/comptes/{id}**
  - Response: JSON or XML representation of the account.
Create a New Account
  - POST **/banque/comptes**
  - Request Body: JSON or XML representation of the new account.
  - Response: The created account.
Update an Existing Account
  - PUT **/banque/comptes/{id}**
  - Request Body: JSON or XML representation of the updated account.
  - Response: The updated account.
Delete an Account
  - DELETE **/banque/comptes/{id}**
  - Response: None.
### H2 Database
To access the H2 database console:

  1. Navigate to **http://localhost:8082/h2-console.**
  2. Use the following credentials:
    - JDBC URL: **jdbc:h2:mem:banque;MODE=MYSQL**
    - Username: **root**
    - Password: **@1234567890@**
### Project Structure
```
src
├── main
│   ├── java
│   │   └── com.MyBanque.MyBanque
│   │       ├── Config
│   │       ├── Enums
│   │       ├── Repositories
│   │       ├── ServiceRest
│   │       └── entities
│   └── resources
│       ├── application.properties
│       ├── static
│       └── templates
└── test
    └── java
        └── com.MyBanque.MyBanque
```
### Sample Data
The application preloads the H2 database with sample bank accounts upon startup. This is configured in **MyBanqueApplication.java** using a **CommandLineRunner**.

### Configuration
  - application.properties:
    - Customize the database and server properties here.
    - Example properties:
    ```
    spring.application.name=WebServices
    spring.h2.console.enabled=true
    spring.jpa.show-sql=true
    spring.datasource.url=jdbc:h2:mem:banque;MODE=MYSQL
    spring.datasource.username=root
    spring.datasource.password=@1234567890@
    server.port=8082
    ```
## Demonstration
Below is a video demonstration of the MyBanque API in action using Postman. This video showcases the various endpoints and how to perform CRUD operations on bank accounts. Watch to see how easy it is to interact with the API!
### Watch the demonstration:

https://github.com/user-attachments/assets/af282739-c19d-4a4e-9b7a-204454d5baef

## Author
### Elansari Jaafar
[GitHub Profile](https://github.com/Elansari-Jaafar)
## License
This project is open-source and available under the **MIT License**.



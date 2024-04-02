# Data Retrieval Carbon Cell Assignment

This project is aimed at retrieving and analyzing data related to carbon cells. It provides functionality for user authentication and data retrieval from a public API.

## Table of Contents
- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Project Structure](#project-structure)



## Introduction

The Data Retrieval Carbon Cell Assignment project is developed to serve as an educational or professional assignment. It involves functionalities such as user registration, authentication, and fetching data from a public API.

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JSON Web Tokens (JWT)
- Lombok

## Usage

To use this project, follow these steps:

1. Clone the repository to your local machine:
`git clone https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment.git.`
2. Navigate to the project directory:

3. Build and run the project using Maven or your preferred IDE.

4. Access the provided endpoints for user registration, login, and data retrieval.

## Endpoints

- `POST /register`: Register a new user.
- `POST /login`: Authenticate and log in a user.
- `GET /fetchApi`: Fetch data entries from a public API.
.

## Project Structure

The project follows a standard Spring Boot application structure. Here are some key directories and files:

- `src/main/java/com/example/Data/Retrieval/CarbonCell/Assignment/controller`: Contains controllers for handling HTTP requests.
- `src/main/java/com/example/Data/Retrieval/CarbonCell/Assignment/model`: Contains entity and response classes.
- `src/main/java/com/example/Data/Retrieval/CarbonCell/Assignment/service`: Contains service classes for business logic implementation.
- `src/main/java/com/example/Data/Retrieval/CarbonCell/Assignment/repository`: Contains repositories for interacting with the database.
- `src/main/java/com/example/Data/Retrieval/CarbonCell/Assignment/configuration`: Contains configuration classes, including Spring Security configuration.

## Implementation of JWT Authentication and Endpoints

### Proper Implementation of JWT Authentication
The project ensures the proper implementation of JWT (JSON Web Token) authentication by generating and verifying tokens securely. The project provides functional endpoints for user registration, login, and logout. These endpoints allow users to securely create an account, authenticate themselves, and terminate their session when needed. Each endpoint follows RESTful principles and includes appropriate request and response handling.

### Documentation of API Endpoints Using Swagger
The API documentation can be accessed using `Swagger UI. Visit http://localhost:8080/swagger-ui/index.html`





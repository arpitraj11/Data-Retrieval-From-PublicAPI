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
- MySQL 

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

![Screenshot 2024-04-02 162550](https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment/assets/114294354/70e27321-e6bd-45a9-9bf6-471a955ccdd3)

![Screenshot 2024-04-02 162625](https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment/assets/114294354/2f90f29c-bdbd-4348-a986-5275a9a07089)

![Screenshot 2024-04-02 162658](https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment/assets/114294354/23323030-048d-4f1d-a446-0555244e4a3d)

![Screenshot 2024-04-02 162801](https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment/assets/114294354/b169536b-f958-41db-8552-b73d49fb3ef0)

![Screenshot 2024-04-02 231604](https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment/assets/114294354/e8645a29-435f-4627-ae2b-be3e77cf9d2f)




## Implementation of JWT Authentication and Endpoints

### Proper Implementation of JWT Authentication
The project ensures the proper implementation of JWT (JSON Web Token) authentication by generating and verifying tokens securely. The project provides functional endpoints for user registration, login, and logout. These endpoints allow users to securely create an account, authenticate themselves, and terminate their session when needed. Each endpoint follows RESTful principles and includes appropriate request and response handling.

### Documentation of API Endpoints Using Swagger
The API documentation can be accessed using `Swagger UI. Visit http://localhost:8080/swagger-ui/index.html`

![Screenshot 2024-04-02 231217](https://github.com/arpitraj11/arpitraj11-Data-Retrieval-Carbon-Cell-Assignment/assets/114294354/69a19aea-9737-49ce-b5b6-5cd63733fa9b)






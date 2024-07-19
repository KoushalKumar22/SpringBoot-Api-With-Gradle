# SpringBoot-Api-With-Gradle

This project demonstrates a simple Spring Boot application with gradle to perform basic CRUD operations on `teacher` entities. The application includes CRUD operations and allows testing through Postman.
## Features

- Save teacher data to the database
- Retrieve all records of teacher
- Retrieve combines data by name or by id
- Update all data by id
- update partial data by id using `ReflectionUtils`

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- postgreSQL Database (for testing purposes)
- Gradle

## Getting Started

### Prerequisites

- Java 8 or higher
- Gradle

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/KoushalKumar22/SpringBoot-Api-With-Gradle.git
   cd BreadcrumbsSpringBoot-Api-With-Gradle

2. Build the project:
   ```sh
     gradle clean build
3. Run the application:
   ```sh
     gradle bootRun
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: '/test'

- Method: GET

- Description: Test the API to ensure it's running

- Response: "This Is A Test Run"

2. Save Teacher Data
- URL: '/save'
- Method: POST
- Description: Save a new Teacher record to the database
- Request Body: json in postman
  ```sh
    {
        "name": "her",
        "address": "ranchi"
    }

3. Get All Teachres Records
- URL: '/all'
- Method: GET
- Description: Retrieve all teachers records from the database
- Response: A list of teachres objects
  
4. Get records by ID
- URL: '/id/{id}'
- Method: GET
- Description: Retrieve an teacher record by its ID
5. Get teacher by Name
- URL: '/name/{name}'
- Method: GET
- Description: Retrieve an teacher record by name

6. update teacher all data by id
- URL: '/updateall/{id}'
- Method: put
- Description: update all data of a teacher

7. update teachers perticular data by id
- URL: '/update/{id}'
- Method: patch
- Description: update an perticular data of a teacher


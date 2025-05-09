# Generic CRUD API with Spring Boot

## Description
In this practical session, we created a **generic CRUD controller** using Spring Boot that can be reused for various models. A specific implementation was demonstrated with a `StudentController` that extends the generic `CRUDcontroller` to perform CRUD operations on student data. The generic design ensures code reusability and simplifies REST API development for different data models.

## Overview
This Spring Boot application demonstrates how to:
* Create a generic `CRUDcontroller` class for handling CRUD operations.
* Extend the generic controller for a specific entity, in this case, `Student`.
* Store and manage objects using a `HashMap` in memory.
* Perform CRUD operations through REST API endpoints.

## Features
* ✅ Generic `CRUDcontroller` class using Java Generics
* ✅ CRUD operations for any object type
* ✅ Student-specific implementation
* ✅ In-memory storage using `HashMap`
* ✅ RESTful API design with Spring Boot


## Clone the repository.
* Open it in your preferred IDE (e.g., IntelliJ or Eclipse).
* Run the Spring Boot application.
* Use Postman or any REST client to test the endpoints at http://localhost:8080/student.

## Usage
This project showcases how to design a flexible REST API using Java generics and Spring Boot. You can reuse the CRUDcontroller<K, T> for any entity by extending it and specifying the key and model types.

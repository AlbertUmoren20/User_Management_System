# 📌 Project Title

**User Management REST API**

---

## 🧾 Project Overview

The **User Management REST API** is a beginner-friendly Spring Boot backend application designed to manage users through a clean and structured RESTful architecture. The system supports full CRUD (Create, Read, Update, Delete) operations and demonstrates best practices in **Spring Boot application layering**, **REST API design**, and **exception handling**.

This project was built to strengthen my understanding of **Java backend development** and serve as a foundation for more advanced features such as authentication, validation, and database integration.

---

## 🎯 Key Features

* Create new users
* Retrieve all users
* Retrieve a user by ID
* Update existing user details
* Delete users
* Graceful handling of non-existent resources

---

## 🛠️ Tech Stack

* **Java 17**
* **Spring Boot**
* **Spring Web (REST APIs)**
* **Spring Data JPA**
* **H2 In-Memory Database**
* **Maven**

---

## 🏗️ Application Architecture

The project follows a **layered architecture** to ensure maintainability and scalability:

* **Controller Layer** – Handles HTTP requests and responses
* **Service Layer** – Contains business logic
* **Repository Layer** – Manages database interactions using JPA
* **Model Layer** – Defines entity mappings


This separation of concerns makes the application easy to extend and test.

---

## 🔌 API Endpoints

| Method | Endpoint          | Description         |
| ------ | ----------------- | ------------------- |
| POST   | `/api/users`      | Create a new user   |
| GET    | `/api/users`      | Retrieve all users  |
| GET    | `/api/users/{id}` | Retrieve user by ID |
| PUT    | `/api/users/{id}` | Update user details |
| DELETE | `/api/users/{id}` | Delete a user       |

---

## ⚠️ Error Handling

* Custom exception (`UserNotFoundException`) is thrown when a user ID does not exist
* HTTP status codes are properly returned to the client
* Ensures clean and predictable API responses

---

## 📚 What I Learned

Through this project, I gained hands-on experience with:

* Spring Boot project setup and configuration
* RESTful API design principles
* Dependency Injection
* JPA repositories and entity mapping
* Exception handling in Spring Boot
* Testing APIs using Postman
* Writing clean, maintainable backend code

---


## 🔗 Ideal Use Case

This project serves as:

* A **backend portfolio project**
* A foundation for **enterprise Spring Boot applications**
* A stepping stone toward **microservices and secure APIs**


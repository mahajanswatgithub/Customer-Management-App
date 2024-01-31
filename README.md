
> ## Introduction 
*Cutomer Management System API is a backend project that aims to provide a robust and scalable platform for users to create and manage Tasks, update on tasks, delte the tasks, and authorize user and Adming can control all Task Management System. The platform is designed to offer a seamless user experience and allow tasks to showcase their writing skills and engage with a wider audience.*

-  ## [**Framework and Technologies Used :**](#heading-ids) ##
___
- Java Spring Boot: For building the backend server and managing RESTful endpoints.

- MySQL: As the relational database management system to store user and blog-related data.

- Hibernate: For object-relational mapping between Java entities and the MySQL database.


- Swagger: For API documentation and testing.

- Maven: As the build tool to manage dependencies and run tasks.
- ### Framework : **SpringBoot**
- ### Technologies : **Java, MySQL**
- ### Others : **Java Persistence API (JPA), Swagger UI, Email**


> ## Features

- User Registration and Authentication: Users can sign up, log in, and log out securely using email and password credentials.
- Admin Registration and Authentication: Admin can sign up, log in, and log out securely using email and password credentials 
and Admin can also control all activity of any user.
- Create and Manage Tasks: Authenticated users can create new Tasks, edit their existing task, and delete their tasks.

- Pagination: Tasks are paginated to enhance the user experience.

- User-Friendly API: The project provides a well-documented and user-friendly API for easy integration with front-end applications.

_____

# Classes and Instructions

This section contains information about the project and how to perform operations in the application.


## Controller Section

-   *This section contains a User Controller and a Auth Controller* :

* ### User Controller
    - This class contains various API endpoints that helps user to interact with the application resources. Some of the examples are :

    * @PostMapping("user/create")
    * @PutMapping("user/update-profile")
    * @GetMapping("user/users")
    * @GetMapping("user/user/{UserId}")
    * @DeleteMapping("/delete/{Id}")

* ### Auth Controller
    - This section is used to authenticate user and provide him a **JWT token**. This helps in securing our application so that only validated users are allowed to access it.

## Service Section

- *This section contains various classes each of which contains methods for buisness logics of the APIs*

* ### User Service Class

    * This class implements the logic of how user date is processed with application, like save, update and delete.

## Model Section

- *This section contains various models and a DTO which are used as tables to store data in our database.*

## Repository Section

- *This section contains Repository for our user model.*


## Security Section

- This section helps us implement and configure Spring Security according to our needs. This helps in securing our app and provided authentication service to the application. Some examples of the classes implemented in this section are :

* #### JwtAuthenticationEntry Point
* #### JwtAuthenticationFilter
* #### JwtHelper


## Database Design
- *Here we have used Relational Data to store data.*

- *We have used MYSQL and the database is hosted on a local server.*



## [**Data Structure used in my Project**](#heading-ids) ##
____
> - **[Used :-](#heading-ids)** *SQL Database --> But Mostly used Java Concept, oops, collection, ENUM*



## [**Encryption**](#heading-ids) ##
____
*Authentication is implemented using an Authentication Token class. This token is generated upon successful sign-in and must be included in the headers of subsequent requests to authorized endpoints.*















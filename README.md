# Taco Cloud Authorization Server App

This authorization server is used to get authorization with JWT at [Taco Cloud](https://github.com/tizor98/TacoCloud) app. This project is an implementation of `Spring Authentication Server Project` using ``Spring Boot 2.7.8``.
In this project `Java 11` was used.

You will find instructions to get authorization with file: `./auth-instructions.txt`.

### Dependencies

| Dependency                         | Version                                |
|------------------------------------|----------------------------------------|
| Spring Boot                        | 2.7.8                                  |
| Spring Data JPA                    | To manage connection with SQL db       |
| H2 Database                        | To simulate an SQL database            |
| Spring Oauth2 Authorization Server | Depends on Spring Boot version         |
| Lombok                             | To autogenerate getters, setters, etc. |

### Created by Alberto Ortiz
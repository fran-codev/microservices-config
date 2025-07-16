# 🧩 Basic Microservices Configuration - Spring Boot & Spring Cloud

This project provides a basic setup of a microservices architecture using Spring Boot 3.5.3 and Spring Cloud 2025.0.0. It includes centralized configuration, service discovery, an API gateway, and a sample product microservice.

## 🚀 Included Services

- **config-server**: Centralized configuration using Spring Cloud Config Server.
- **service-registry**: Service discovery using Eureka.
- **apigateway**: Dynamic routing using Spring Cloud Gateway.
- **microservice-product**: Product microservice with H2, JPA, and OpenAPI.

## 🛠️ Technologies

- Java 21
- Spring Boot 3.5.3
- Spring Cloud 2025.0.0
- Eureka Discovery
- Spring Cloud Gateway
- Spring Cloud Config
- SpringDoc OpenAPI
- H2 Database
- Maven

## 📁 Project Structure


    ├── config-server # Centralized configuration service
    ├── service-registry # Eureka server for service discovery
    ├── apigateway # API Gateway for routing requests
    └── microservice-product # Product microservice (JPA, H2, OpenAPI)

## ▶️ Run Locally

1. Clone the repository:
   ```bash
   git clone https://github.com/fran-codev/microservices-config.git
   cd microservices-config

    Start each service in this order:

        config-server

        service-registry

        apigateway

        microservice-product

    Run each with:

    mvn spring-boot:run

## 📌 Useful Endpoints

| Service          | URL                                                                 |
|------------------|----------------------------------------------------------------------|
| Eureka Dashboard | [http://localhost:8761](http://localhost:8761)                       |
| API Gateway      | [http://localhost:8080/api/products](http://localhost:8080/api/products) – Product microservice route |
| Product Swagger  | [http://localhost:8081/swagger-ui/index.html](http://localhost:8081/swagger-ui/index.html) – Swagger UI hosted in product service |

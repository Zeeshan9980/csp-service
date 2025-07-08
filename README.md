# CSP Policy Microservice

A Spring Boot microservice for managing Content Security Policies in a logistics platform modernization project.

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA + Hibernate
- MySQL
- Swagger (Springdoc OpenAPI)
- JUnit for unit testing
- AWS Lambda-compatible structure

## 🧪 API Endpoints

| Method | Endpoint             | Description                   |
|--------|----------------------|-------------------------------|
| POST   | `/api/csp`           | Create or update CSP policy   |
| GET    | `/api/csp/{service}` | Get CSP directives by service |

## ✅ Run Locally

```bash
mvn clean install
mvn spring-boot:run

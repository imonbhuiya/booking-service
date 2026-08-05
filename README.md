# 🏨 Enterprise Booking Platform

> A production-style booking platform built with **Java** and **Spring Boot**, following **Hexagonal Architecture**, **Domain-Driven Design (DDD)**, and **CQRS** principles. The project is designed to simulate real enterprise backend development and demonstrate modern software engineering practices.

---

## 📖 Project Overview

This project is not just another CRUD application.

The goal is to build a scalable, maintainable, and production-ready backend system while learning the technologies and architectural patterns used in enterprise software.

The application will evolve from a simple booking service into a complete microservices ecosystem with asynchronous communication, distributed caching, monitoring, and cloud integration.

---

## 🎯 Learning Goals

Throughout this project, we will implement and understand:

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST API Design
- Docker
- Domain-Driven Design (DDD)
- Hexagonal Architecture
- CQRS (Command Query Responsibility Segregation)
- Microservices
- Apache Kafka
- Redis
- Spring Actuator
- Prometheus
- Grafana
- AWS (S3, SNS, SQS)
- CI/CD
- Git & GitHub

Every technology will be introduced only when the project reaches a real business requirement that justifies its use.

---

# 🏗 Architecture

The project follows Hexagonal Architecture.

```
                    Client
                      │
                      ▼
               REST Controller
                      │
                      ▼
                 Use Cases
                      │
                      ▼
                Domain Layer
                      │
               Repository Port
                      │
                      ▼
          Repository Adapter
                      │
                      ▼
              Spring Data JPA
                      │
                      ▼
                    MySQL
```

As the project grows, additional services such as Kafka, Redis, AWS, and monitoring tools will be integrated without breaking the architecture.

---

# 📂 Current Project Structure

```
src/main/java/com/imon/bookingservice

├── application
│   └── usecase
│
├── domain
│   ├── model
│   └── repository
│
├── infrastructure
│   └── persistence
│
├── presentation
│   └── controller
│
└── BookingServiceApplication
```

---

# 🚀 Current Features

- Create Booking API
- Spring Boot REST API
- MySQL Integration
- Hibernate ORM
- Dockerized MySQL
- Hexagonal Architecture
- Clean Package Structure

---

# 🛠 Tech Stack

### Backend

- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Database

- MySQL

### Build Tool

- Maven

### Containerization

- Docker

### Version Control

- Git
- GitHub

---

# 📅 Development Roadmap

## Phase 1

- [x] Spring Boot Setup
- [x] Docker MySQL
- [x] Booking Entity
- [x] Booking Repository
- [x] Hexagonal Architecture
- [x] Create Booking API

---

## Phase 2

- [ ] DTO
- [ ] Validation
- [ ] Global Exception Handling
- [ ] Get Booking
- [ ] Get All Bookings
- [ ] Update Booking
- [ ] Cancel Booking
- [ ] Pagination
- [ ] Search

---

## Phase 3

- [ ] Domain-Driven Design
- [ ] Value Objects
- [ ] Aggregates
- [ ] Domain Events

---

## Phase 4

- [ ] CQRS
- [ ] Command Side
- [ ] Query Side

---

## Phase 5

- [ ] Redis
- [ ] Distributed Locking
- [ ] Cache Management

---

## Phase 6

- [ ] Kafka
- [ ] Event-Driven Communication
- [ ] Notification Service

---

## Phase 7

- [ ] Microservices
- [ ] API Gateway
- [ ] Service Communication

---

## Phase 8

- [ ] Spring Actuator
- [ ] Prometheus
- [ ] Grafana
- [ ] Monitoring Dashboard

---

## Phase 9

- [ ] AWS S3
- [ ] AWS SNS
- [ ] AWS SQS

---

## Phase 10

- [ ] Docker Compose
- [ ] CI/CD Pipeline
- [ ] Production Deployment

---

# 🎓 Learning Philosophy

This repository is built as a learning journey.

Instead of adding technologies just for the sake of using them, every feature will be introduced when a real business requirement makes it necessary.

The focus is to understand:

- Why a technology is needed
- What problem it solves
- How it works internally
- How it is used in enterprise applications

---

# 👨‍💻 Author

**Md Imon Bhuiya**

Software Engineer | Java Backend Developer

GitHub: https://github.com/imonbhuiya

---

## ⭐ Project Status

🚧 Active Development

This project is continuously evolving as new enterprise concepts and technologies are implemented.

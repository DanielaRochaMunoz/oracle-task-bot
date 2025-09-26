# Task Management Bot — Oracle + ITESM

Project developed in collaboration with Oracle and ITESM to optimize **task management in development teams**, integrating automation, security, and cloud-native deployments.

![image](https://user-images.githubusercontent.com/7783295/116454396-cbfb7a00-a814-11eb-8196-ba2113858e8b.png)

---

## Table of Contents
- [Overview](#overview)
- [Architecture & Design](#architecture--design)
- [Main Features](#main-features)
- [Results & KPIs](#results--kpis)
- [Tech Stack](#tech-stack)
- [Testing Strategy](#testing-strategy)
- [Installation & Execution](#installation--execution)
- [Security](#security)
- [Future Work & Scalability](#future-work--scalability)
- [License](#license)

---

## Overview
The system integrates a **Telegram bot** with a **Spring Boot backend** deployed on **Oracle Cloud Infrastructure (OCI)** using **microservices, Docker, and Kubernetes**.

**Goal:** Improve collaboration, task tracking, and efficiency in development teams through automation, CI/CD pipelines, and secure cloud practices.

---

## Architecture & Design
**Architecture:** Layered + microservices (authentication, task handling, statistics).  

**Patterns applied:**
- Model-View-Controller (Spring Boot + REST)
- Service Layer Pattern for business logic encapsulation
- Repository Pattern (Spring Data JPA)
- Data Transfer Objects (DTOs) for input/output validation
- Command Pattern for bot commands

**Deployment:**
- Containerized with Docker  
- Orchestrated with Kubernetes on OCI  
- CI/CD pipelines (YAML-based) for automated build, test, and deploy  

---

## Main Features
- Task management via Telegram with secure user sessions  
- Spring Boot REST APIs protected with **Role-Based Access Control (RBAC)**  
- Cloud-native deployment on OCI with microservices + Kubernetes  
- Automated CI/CD pipelines (GitHub Actions → OCI)  
- Integration & risk analysis with Use Case Points  

---

## Results & KPIs
- **Deployment time:** reduced to < 5 minutes  
- **Team efficiency:** improved by +120%  
- **Cost savings:** 16% ($4,600 USD → $3,862.5 USD)  
- **Resilience:** recovered critical components after data loss incident using backups + version control  

**KPIs monitored:**
- Hours invested per sprint  
- Developer productivity per sprint  
- Tasks completed vs. estimated  

---

## Tech Stack
- **Languages:** Java, SQL  
- **Frameworks:** Spring Boot  
- **Cloud & DevOps:** OCI, Docker, Kubernetes, GitHub Actions (CI/CD)  
- **Testing:** JUnit, Postman, Selenium, JMeter  
- **Security:** RBAC, OWASP ZAP, SQLi/XSS penetration testing  

---

## Testing Strategy
Comprehensive testing was performed to ensure reliability and security:

- **Unit Testing (52 cases):** service and controller validation  
- **Integration Testing:** backend + database communication  
- **Security Testing:**  
  - SQL Injection, Command Injection, XSS  
  - OWASP ZAP + Sniper reconnaissance  
- **End-to-End Testing:** Selenium for GUI + bot flows  
- **Load Testing:** JMeter to simulate concurrent users  

---

## Installation & Execution

### Prerequisites
- Java 17+  
- Maven  
- Docker 20.x+  
- Oracle Cloud Infrastructure (configured)  

### Steps
```bash
# 1. Clone repository
git clone https://github.com/DanielaRochaMunoz/oracle-task-bot.git
cd oracle-task-bot

# 2. Build project
mvn clean install

# 3. Build Docker image
docker build -t task-bot:1.0 .

# 4. Run container
docker run -p 8080:8080 task-bot:1.0
```

**Access service:**  
[http://localhost:8080/api/tasks](http://localhost:8080/api/tasks)

---

## Security
- RBAC implemented at endpoint level  
- Environment variables secured via `.env`  
- Penetration tests against SQLi, XSS, and other OWASP Top 10  
- Risk analysis documented with mitigation strategies  

---

## Future Work & Scalability

**Planned improvements:**
- AI-driven summaries of KPIs and progress  
- Real-time notifications for task updates  
- Multi-team support in a single deployment  
- Enhanced UX with dashboards and insights  

**Scalability improvements:**
- Load balancing  
- Caching strategies  
- Auto-scaling in OCI  

---

## License
Academic and research use.

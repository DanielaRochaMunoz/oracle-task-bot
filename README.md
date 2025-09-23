# Task Management Bot — Oracle + ITESM

Project developed in collaboration with Oracle and ITESM to optimize **task management in development teams**, integrating automation, security, and cloud deployments.

---

## Table of Contents
- [Main Features](#-main-features)
- [Results](#-results)
- [Tech Stack](#-tech-stack)
- [Prerequisites](#-prerequisites)
- [Installation & Execution](#-installation--execution)
- [Security](#-security)
- [License](#-license)

---

## Main Features
- Backend built with **Spring Boot** using secure REST APIs and **Role-Based Access Control (RBAC)**.  
- Integration with a **Telegram bot** for agile and accessible task management.  
- **Automated deployments on Oracle Cloud Infrastructure (OCI)** using **Docker** and **GitHub Actions** pipelines.  
- Integration tests in **Postman**, risk analysis, and estimations with **Use Case Points**.

---

## Results
- Reduced deployment time to < 5 minutes.  
- Increased development team efficiency by +120%.  
- 16% estimated cost savings (184 h → 154.5 h).

---

## Tech Stack
- **Languages:** Java, SQL  
- **Frameworks:** Spring Boot  
- **Cloud & DevOps:** Oracle Cloud Infrastructure (OCI), Docker, GitHub Actions (CI/CD)  
- **Testing:** Postman  
- **Security:** RBAC, risk analysis

---

## Prerequisites
- **Java 17** or higher  
- **Maven** installed  
- **Docker** 20.x or higher  
- **Oracle Cloud Infrastructure (OCI)** account configured  
- Environment variables defined in a `.env` file

---

## Installation & Execution

### 1. Clone repository
\`\`\`bash
git clone https://github.com/your-username/task-management-bot.git
cd task-management-bot
\`\`\`

### 2. Build project with Maven
\`\`\`bash
mvn clean install
\`\`\`

### 3. Build Docker image
\`\`\`bash
docker build -t task-bot:1.0 .
\`\`\`

### 4. Run container
\`\`\`bash
docker run -p 8080:8080 task-bot:1.0
\`\`\`

### 5. Access service
Open in browser:  
\`\`\`
http://localhost:8080/api/tasks
\`\`\`

---

## Security
- RBAC implemented on endpoints.  
- Environment variables hidden in `.env`.  
- Risk analysis documented.

---

## 📜 License
Academic and research use.

# 🌟 Crudiblis Service

A lightweight Quarkus-based micro‑service for managing mythical creatures (“Crudiblis”)  
Elegant, creative, and ready to scale.

---

## 🧙‍♂️ What is Crudiblis?

Crudiblis is your go‑to service for storing, retrieving, and exploring data about magical beasts and spirits—from Phoenixes to Dragons and beyond.  
Perfect for demos, learning JPA/Quarkus, or building fantasy‑themed apps.

---

## 🚀 Features

- **Create, Read, Update, Delete** endpoints for Crudiblis entities  
- Uses **Quarkus** + **Hibernate ORM** for lightning‑fast startup and runtime  
- UUID‑based IDs via Hibernate’s `@UuidGenerator`  
- Clean JSON REST API (`/v1/crudiblis`)  
- CORS‑enabled out of the box (configure in `application.properties`)

---

## ⚙️ Tech Stack

- **Java 17**  
- **Quarkus** framework  
- **Hibernate ORM** / JPA  
- **PostgreSQL** (or any JDBC‑compatible DB)  
- **Maven** for build & dependency management  

---

## 🔧 Getting Started

1. **Configure your database** in `src/main/resources/application.properties`:
   ```properties
   quarkus.datasource.db-kind=postgresql
   quarkus.datasource.username=…
   quarkus.datasource.password=…
   quarkus.datasource.jdbc.url=jdbc:postgresql://localhost:5432/crudiblis
   quarkus.http.cors=true
   quarkus.http.cors.origins=*

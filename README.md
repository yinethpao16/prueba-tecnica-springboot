# Prueba Técnica – Backend Spring Boot

Este proyecto corresponde a una **API REST** desarrollada con **Spring Boot**, como parte de una prueba técnica para desarrollador backend.

La aplicación permite gestionar **Alumnos**, **Materias** y **Notas**, persistiendo la información en una base de datos relacional levantada con **Docker**.

---

## 🛠️ Tecnologías utilizadas

- Java 17
- Spring Boot 3.5.x
- Spring Data JPA
- Maven (Maven Wrapper)
- PostgreSQL (en Docker)
- Docker & Docker Compose
- Git

---

## 📋 Requisitos previos

- Java 17
- Git
- Docker y Docker Compose

---

## 📥 Clonar el repositorio

```bash
git clone https://github.com/yinethpao16/prueba-tecnica-springboot.git
cd prueba-tecnica-springboot
```

---

## 🐳 Levantar la base de datos con Docker

```bash
docker compose up -d
```

---

## ⚙️ Configuración de variables de entorno

En Windows (PowerShell):

```env
$env:DB_URI="jdbc:postgresql://localhost:5432/escuela_db"
$env:DB_USER="admin"
$env:DB_PASSWORD="admin123"
$env:DB_DRIVER="org.postgresql.Driver"
```

En Linux / macOS:

```env
export DB_URI=jdbc:postgresql://localhost:5432/escuela_db
export DB_USER=admin
export DB_PASSWORD=admin123
export DB_DRIVER=org.postgresql.Driver
```

---

## ▶️ Ejecutar la aplicación

### macOS / Linux
```bash
./mvnw spring-boot:run
```

### Windows
```powershell
mvnw.cmd spring-boot:run
```

Disponible en:
http://localhost:8080

---

## 🔗 Endpoints principales

- GET /api/alumnos
- POST /api/alumnos
- GET /api/materias
- POST /api/materias
- GET /api/notas
- POST /api/notas

---

## 👩‍💻 Autora

Yineth Paola Duarte Contreras

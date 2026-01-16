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

Crear un archivo `.env` en la raíz del proyecto:

```env
DB_URL=jdbc:postgresql://localhost:5432/pruebatecnica
DB_USERNAME=postgres
DB_PASSWORD=postgres
DB_DRIVER=org.postgresql.Driver
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

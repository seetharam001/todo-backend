# Todo Backend API

A RESTful Todo application backend built with Java, Spring Boot, and MySQL.

## Live API

[https://todo-backend-0dk0.onrender.com/api/todos](https://todo-backend-0dk0.onrender.com/api/todos)

## Features

- Create a new task
- Retrieve all tasks
- Retrieve a task by ID
- Update existing tasks
- Delete tasks
- Mark tasks as completed
- Automatic database persistence with MySQL

## Tech Stack

- Java 17
- Spring Boot 3.5.15
- Spring Data JPA
- MySQL
- Maven
- Docker
- Render

## Project Structure

```text
src/main/java
├── controller
├── service
├── repository
└── entity
```

## API Endpoints

| Method | Endpoint        | Description      |
| ------ | --------------- | ---------------- |
| POST   | /api/todos      | Create a task    |
| GET    | /api/todos      | Get all tasks    |
| GET    | /api/todos/{id} | Get a task by ID |
| PUT    | /api/todos/{id} | Update a task    |
| DELETE | /api/todos/{id} | Delete a task    |

## Environment Variables

Create the following environment variables:

```properties
SPRING_DATASOURCE_URL=
SPRING_DATASOURCE_USERNAME=
SPRING_DATASOURCE_PASSWORD=
```

## Run Locally

1. Clone the repository:

```bash
git clone https://github.com/YOUR_USERNAME/todo-backend.git
```

2. Navigate to the project:

```bash
cd todo-backend
```

3. Configure environment variables.
4. Run the application:

```bash
./mvnw spring-boot:run
```

The backend will start on:

[http://localhost:8080](http://localhost:8080/)

## Deployment

- Backend Hosting: Render
- Database: MySQL

## Author

Built by Seetharam.

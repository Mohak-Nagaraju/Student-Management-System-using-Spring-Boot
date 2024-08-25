# Student Management System

This project is a **Student Management System** built with **Spring Boot**. It provides a RESTful API for performing CRUD operations on a student entity, including creating, reading, updating, and deleting student records.

## Features

- **Add Students:** Register new students with their name, email, and date of birth.
- **Get Students:** Retrieve a list of all students.
- **Update Students:** Modify the name or email of an existing student.
- **Delete Students:** Remove a student by their ID.

## Project Structure

```bash
src
├── main
│   └── java
│       └── com
│           └── example
│               └── demo
│                   ├── student
│                   │   ├── Student.java          # Entity class for Student
│                   │   ├── StudentConfig.java    # Pre-loads some initial data
│                   │   ├── StudentController.java# REST controller for handling HTTP requests
│                   │   ├── StudentRepository.java# Interface for database operations
│                   │   └── StudentService.java   # Business logic for managing students
│                   └── DemoApplication.java      # Main class for running the Spring Boot application
```
## Getting Started

### Prerequisites

- **Java 17** or higher
- **Maven** or **Gradle**
- **Spring Boot 3.x**
- **PostgreSQL Database** (or any preferred database)

### Running the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   cd student-management-system
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. The application will start on `http://localhost:8080`.

### API Endpoints
- `GET /api/student` - Retrieve all students.
- `POST /api/student` - Register a new student.
- `PUT /api/student/{studentId}` - Update an existing student's name or email.
- `DELETE /api/student/{studentId}` - Delete a student by ID.

package com.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsApplication.class, args);
	}


}
//
//3️⃣ Spring Boot Task (Easy)
//
//Task:
//Create a Spring Boot REST API to manage Employees:
//
//POST /employees → Add employee (id, name, department, salary)
//
//GET /employees → Fetch all employees
//
//GET /employees/{id} → Fetch employee by id
//
//Use H2 in-memory database with JPA.
//
//Goal: Practice basic CRUD + REST + database setup.

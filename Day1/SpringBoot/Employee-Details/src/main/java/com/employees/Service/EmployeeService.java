package com.employees.Service;

import com.employees.Entity.Employee;
import com.employees.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // save
    public Employee saveEmployee(Employee employee){

        return employeeRepository.save(employee);
    }

    //get id

    public Employee getById(int id){

        return employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee id not found "+id));
    }

    //get All employee data
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }

    // update employee
    public Employee updateEmployee(Employee employee, int id){

       Employee emp = employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Employee id not found "+id));

       emp.setName(employee.getName());
       emp.setDepartment(employee.getDepartment());
       emp.setSalary(employee.getSalary());

       return employeeRepository.save(emp);
    }


    // delete emp id
    public void deleteEmp(int id){

         employeeRepository.deleteById(id);
    }
}

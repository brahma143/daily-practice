package com.employees.Controller;

import com.employees.Entity.Employee;
import com.employees.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee-app")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee){

        return new ResponseEntity<>(employeeService.saveEmployee(employee), HttpStatus.CREATED);

    }

    @GetMapping("/getId")
    public ResponseEntity<Employee> getById(@RequestParam int id){

        return new ResponseEntity<>(employeeService.getById(id),HttpStatus.FOUND);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Employee>> getAllEmp(){

        return new ResponseEntity<>(employeeService.getAllEmployees(),HttpStatus.OK);
    }

    @PutMapping("/updateEmp")
    public ResponseEntity<Employee>  updateEmployee(@RequestBody Employee employee, @PathVariable int id){

        return new ResponseEntity<>(employeeService.updateEmployee(employee,id),HttpStatus.FOUND);
    }


    @DeleteMapping("/deleteId")
    public ResponseEntity<String> deleteById(@RequestParam int id){
        employeeService.deleteEmp(id);
        return new ResponseEntity<>("Employee details deleted successfuly",HttpStatus.FOUND);
    }

}

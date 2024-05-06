package com.example.CrudApiImplementation.controller;

import com.example.CrudApiImplementation.model.Employee;
import com.example.CrudApiImplementation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getEmployee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }


    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee emp){
        return employeeService.createEmployee(emp);
    }

    @DeleteMapping("/delEmployee/{id}")
    public Employee delEmployee(@PathVariable Long id){
        return employeeService.delEmployee(id);
    }

    @PutMapping("/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp){
        return employeeService.updateEmployee(id,emp);
    }

}

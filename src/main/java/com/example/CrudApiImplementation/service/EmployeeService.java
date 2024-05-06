package com.example.CrudApiImplementation.service;

import com.example.CrudApiImplementation.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees ();
    public Employee getEmployee(Long id);
    public Employee createEmployee(Employee emp);
    public Employee delEmployee(Long id);
    public Employee updateEmployee(Long id, Employee emp);

}

package com.example.CrudApiImplementation.service;

import com.example.CrudApiImplementation.dao.EmployeeRepository;
import com.example.CrudApiImplementation.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
      return employeeRepository.findAll();

    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee createEmployee(Employee emp) {
       return employeeRepository.save(emp);
    }

    @Override
    public Employee delEmployee(Long id) {
        Employee emp = employeeRepository.findById(id).orElse(null);
        employeeRepository.deleteById(id);
        return emp;
    }

    @Override
    public Employee updateEmployee(Long id, Employee emp) {
     Employee emp1 = employeeRepository.findById(id).orElse(null);
     emp1.setF_name(emp.getF_name());
     emp1.setL_name(emp.getL_name());
     emp.setEmail(emp.getEmail());
     return employeeRepository.save(emp);

    }
}

package com.Migranov.MVC.service;

import com.Migranov.MVC.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}

package com.Migranov.MVC.dao;

import com.Migranov.MVC.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    public void deleteEmploye(int id);
}

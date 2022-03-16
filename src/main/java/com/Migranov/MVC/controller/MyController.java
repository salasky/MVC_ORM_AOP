package com.Migranov.MVC.controller;

import com.Migranov.MVC.dao.EmployeeDAO;
import com.Migranov.MVC.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;
    @RequestMapping("/emps")
    public String showAllEmployees(Model model){
            List<Employee> allEmployees=employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "allEmployees";
    }
}

package com.Migranov.MVC.controller;

import com.Migranov.MVC.dao.EmployeeDAO;
import com.Migranov.MVC.entity.Employee;
import com.Migranov.MVC.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/allEmployees")
    public String showAllEmployees(Model model){
            List<Employee> allEmployees=employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "allEmployees";
    }
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee employee=new Employee();
        model.addAttribute("employee",employee);
        return "employee-info";

    }
    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/allEmployees ";
    }

    @RequestMapping("/updateEmployee")
    public String updateInfo(@RequestParam("empId") int id,Model model){
        Employee employee=employeeService.getEmployee(id);
        model.addAttribute("employee",employee);
        return "employee-info";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/allEmployees ";
    }
}

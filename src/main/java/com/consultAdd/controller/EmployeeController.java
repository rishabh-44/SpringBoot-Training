package com.consultAdd.controller;

import com.consultAdd.model.Employee;
import com.consultAdd.repository.EmployeeRepository;
import com.consultAdd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

   @GetMapping("/employee")
    public List<Employee> getEmployees()
   {
       List<Employee> employeeList = employeeService.getEmployees();
       return employeeList;
   }
   @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody Employee employee)
   {
       return employeeService.saveEmployee(employee);
   }
}

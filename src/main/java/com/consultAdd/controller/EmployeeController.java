package com.consultAdd.controller;

import com.consultAdd.model.Employee;
import com.consultAdd.repository.EmployeeRepository;
import com.consultAdd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
   @PutMapping("/putEmployee")
    public String putEmployee(@RequestBody Employee employee){
        return employeeService.putEmployee(employee);
   }
   @DeleteMapping("/deleteEmployee")
    public String deleteEmployee(@RequestBody Employee employee){
        return employeeService.deleteEmployee(employee);
   }
}

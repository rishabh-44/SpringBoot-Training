package com.consultAdd.service;

import com.consultAdd.model.Employee;
import com.consultAdd.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public String saveEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            return "Employee already exists";
        } else {
            employeeRepository.save(employee);
            return "Save successfully";
        }
    }
    public String putEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return "Data Updated successfully";
        } else {
            return "Employee doesn't exists";
        }
    }
    public String deleteEmployee(Employee employee) {
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.delete(employee);
            return "Data deleted successfully";
        } else {
            return "Employee doesn't exists";
        }
    }
}
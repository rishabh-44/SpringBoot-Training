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

    public List<Employee> getEmployees()
    {
        return employeeRepository.findAll();
    }

    public String saveEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId()))
        {
            return "Employee already exists";
        }
        else
        {
            employeeRepository.save(employee);
            return "Save successfully";
        }

    }
}

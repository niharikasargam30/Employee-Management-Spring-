package com.example.demo.Service;

import com.example.demo.beans.Employee;
import com.example.demo.beans.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeeDetails(){
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(employeeRepo.getNiharika());
        employee.add(employeeRepo.getVandana());

        return employee;
    }
}

package com.example.demo.Controller;

import com.example.demo.Service.EmployeeService;
import com.example.demo.beans.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class EmployeeController {
    EmployeeService service;

    public EmployeeService getService(){
        return service;
    }

    @Autowired
    public void setService(EmployeeService service){
        this.service = service;
    }

  //@Get("/Niharika")
    public List<Employee> getEmployee(){
        return getService().getEmployeeDetails();
    }

}


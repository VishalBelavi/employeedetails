package com.example.demo.Controller;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeDetails employeeDetails;

    @RequestMapping("/{id}")
    public Employee getEmployeeDetails(@PathVariable Integer id) {
        Employee requestedEmployee = employeeDetails.getEmployee(id);

        return requestedEmployee;
    }

}

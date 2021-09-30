package com.example.demo.repository;

import com.example.demo.model.Address;
import com.example.demo.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDetails {
    Employee employee1 = new Employee(1, "ABC", 10000.00, new Address("Bangalore", "560054"));
    Employee employee2 = new Employee(2, "ABC", 10000.00, new Address("Bangalore", "560054"));
    Employee employee3 = new Employee(3, "ABC", 10000.00, new Address("Bangalore", "560054"));
    Employee employee4 = new Employee(4, "ABC", 10000.00, new Address("Bangalore", "560054"));
    Employee employee5 = new Employee(4, "ABC", 10000.00, new Address("Bangalore", "560054"));
    List<Employee> employees = new ArrayList<>();

    public Employee getEmployee(Integer id){
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        for (int i=0; i<=employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

}

package com.example.demo.model;


import lombok.Getter;

@Getter
public class Employee {

    private Integer id;
    private String name;
    private Double salary;
    private Address address;

    public Employee(Integer id, String name, Double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public Employee(){
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", address=" + address +
                '}';

    }

}

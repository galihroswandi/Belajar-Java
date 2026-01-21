package com.belajar.oop.practice.employeemanagement;

public class Employee {
    private static int nextId = 001;

    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = nextId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        nextId++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    // Getter & Setter
    public int getId() {
        return this.id;
    };

    public void setId(int id) {
        this.id = id;
    };

    public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };

    public double getSalary() {
        return this.salary;
    };

    public void setSalary(double salary) {
        this.salary = salary;
    };

    public String getDepartment() {
        return this.department;
    };

    public void setDepartment(String department) {
        this.department = department;
    };
}

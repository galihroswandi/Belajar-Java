package com.belajar.oop.practice.employeemanagement;

import java.text.NumberFormat;
import java.util.Locale;

public class EmployeeManager {
    Employee[] employess;
    int count = 0;
    private NumberFormat formatter;

    public EmployeeManager(int capacity) {
        employess = new Employee[capacity];

        Locale locale = Locale.of("id", "ID");
        formatter = NumberFormat.getCurrencyInstance(locale);
    }

    public void addEmployee(String name, double salary, String department) {
        employess[count] = new Employee(generateRandomId(), name, salary, department);
        count++;
    }

    public void giveRaise(int employeeId, byte percentage) {
        if (percentage <= 1) {
            System.err.println("❌ Percentage must be greater than 1!");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (employess[i].getId() == employeeId) {
                employess[i].setSalary(employess[i].getSalary() + employess[i].getSalary() * percentage / 100);
                System.out.println("✅ Raise successful!");
                System.out.println("New salary: " + formatter.format(employess[i].getSalary()));
                return;
            }
        }
    }

    public void changeDepartment(int employeeId, String newDept) {
        if (newDept == null || newDept.trim().isEmpty()) {
            System.err.println("❌ New department cannot be empty!");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (employess[i].getId() == employeeId) {
                employess[i].setDepartment(newDept);
                System.out.println("✅ Department changed successfully!");
                System.out.println("New department: " + employess[i].getDepartment());
                return;
            }
        }

        System.err.println("❌ Employee not found!");
    }

    public void calculateAnnualSalary(int employeeId) {
        if (employeeId == 0 || employeeId == -1) {
            System.err.println("❌ Employee ID cannot be 0!");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (employeeId == employess[i].getId()) {
                System.out.println("Annual salary: " + formatter.format(employess[i].getSalary() * 12));
                return;
            }
        }

        System.err.println("❌ Employee not found!");
    }

    public void displayEmployeeInfo() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║ EMPLOYEE MANAGEMENT SYSTEM        ║");
        System.out.println("╠═══════════════════════════════════╣");
        for (int i = 0; i < count; i++) {
            System.out.println("║ Employee ID " + employess[i].getId());
            System.out.println("║ Name: " + employess[i].getName());
            System.out.println("║ Department: " + employess[i].getDepartment());
            System.out.println("║ Salary: " + formatter.format(employess[i].getSalary()));
            if (count > 1) {
                System.out.println("╠═══════════════════════════════════╣");
            }
        }
        System.out.println("╚═══════════════════════════════════╝");
    }

    private int generateRandomId() {
        return Math.abs((int) (Math.random() * 1000));
    }
}

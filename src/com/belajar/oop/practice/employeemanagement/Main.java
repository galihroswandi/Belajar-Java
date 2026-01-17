package com.belajar.oop.practice.employeemanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager(100);
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n╔═══════════════════════════════════╗");
            System.out.println("║ EMPLOYEE MANAGEMENT SYSTEM        ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.println("1. Add Employee");
            System.out.println("2. Give Raise");
            System.out.println("3. Display Employee");
            System.out.println("4. Change Department");
            System.out.println("5. Calculate Annual Salary");
            System.out.println("6. Exit");
            System.out.print("Choose option (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n=== ADD EMPLOYEE ===");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();

                    employeeManager
                            .addEmployee(name, salary, department);
                    break;

                case 2:
                    System.out.println("\n=== GIVE RAISE ===");
                    System.out.print("Enter a employee ID: ");
                    int employeeId = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Percentage Raise: ");
                    byte percentage = scanner.nextByte();
                    scanner.nextLine(); // clear buffer

                    employeeManager.giveRaise(employeeId, percentage);
                    break;

                case 3:
                    employeeManager.displayEmployeeInfo();
                    break;

                case 4:
                    System.out.println("\n=== CHANGE DEPARTMENT ===");
                    System.out.print("Enter a employee ID: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter a new department: ");
                    String newDepartment = scanner.nextLine();

                    employeeManager.changeDepartment(employeeId, newDepartment);
                    break;

                case 5:
                    System.out.println("\n=== CALCULATE ANNUAL SALARY ===");
                    System.out.print("Enter a employee ID: ");
                    employeeId = scanner.nextInt();
                    scanner.nextLine();

                    employeeManager.calculateAnnualSalary(employeeId);
                    break;

                case 6:
                    System.out.println("Thank you for using Employee Management System!");
                    running = false;
                    scanner.close();
                    break;

                default:
                    System.err.println("❌ Invalid option!");
                    running = false;
                    scanner.close();
                    break;
            }
        }
    }
}

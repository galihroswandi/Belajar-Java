package com.belajar.collectionframework.practice.studentgrademanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        boolean running = true;

        while (running) {
            System.out.println("\n╔═══════════════════════════════════════╗");
            System.out.println("║ STUDENT GRADE MANAGEMENT SYSTEM       ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. View Student Details");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Ranking");
            System.out.println("6. Class Statistics");
            System.out.println("7. Export to File");
            System.out.println("8. Remove Student");
            System.out.println("9. Exit");
            System.out.print("Choose option (1-9): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    manager.addStudent(id, name);
                    break;

                case 2:
                    System.out.print("Enter student ID: ");
                    String studentId = scanner.nextLine();
                    Student student = manager.findStudent(studentId);

                    if (student == null) {
                        System.out.println("🚫 Student not found!");
                        break;
                    }

                    System.out.print("Enter subject: ");
                    String subject = scanner.nextLine();
                    System.out.print("Enter grade (0-100): ");
                    double grade = scanner.nextDouble();
                    student.addGrade(subject, grade);
                    break;

                case 3:
                    System.out.print("Enter student ID: ");
                    String viewId = scanner.nextLine();
                    Student viewStudent = manager.findStudent(viewId);

                    if (viewStudent != null) {
                        viewStudent.displayInfo();
                    } else {
                        System.out.println("🚫 Student not found!");
                    }
                    break;

                case 4:
                    manager.displayAllStudents();
                    break;

                case 5:
                    manager.displayRanking();
                    break;

                case 6:
                    Student top = manager.findTopStudent();
                    double classAvg = manager.calculateClassAverage();

                    System.out.println("\n╔═══════════════════════════════════════╗");
                    System.out.println("║ CLASS STATISTICS ║");
                    System.out.println("╠═══════════════════════════════════════╣");
                    System.out.println("║ Total Students: " + manager.getStudentCount());
                    System.out.printf("║ Class Average: %.2f\n", classAvg);

                    if (top != null) {
                        System.out.println("║ Top Student: " + top.getName());
                        System.out.printf("║ Top Average: %.2f\n", top.calculateAverage());
                    }

                    System.out.println("╚═══════════════════════════════════════╝");
                    break;

                case 7:
                    System.out.print("Enter filename (e.g., grades.txt): ");
                    String filename = scanner.nextLine();
                    manager.exportToFile(filename);
                    break;

                case 8:
                    System.out.print("Enter student ID to remove: ");
                    String removedId = scanner.nextLine();
                    manager.removeStudent(removedId);
                    break;

                case 9:
                    System.out.println("\n👋 Thank you for using Grade Management!");
                    running = false;
                    scanner.close();
                    break;

                default:
                    System.out.println("❌ Invalid option!");
                    scanner.close();
                    break;
            }
        }
    }
}

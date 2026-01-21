package com.belajar.collectionframework.practice.studentgrademanagement;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

public class GradeManager {
    private final ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(String id, String name) {
        // Check duplicate ID
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("❌ Student with this ID already exists!");
                return;
            }
        }

        students.add(new Student(id, name));
    }

    // Find student by ID
    public Student findStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Remove student
    public void removeStudent(String id) {
        Student student = findStudent(id);
        if (student != null) {
            students.remove(student);
            System.out.println("✅ Student removed successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }

    // Display all students
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("📋 No students found!");
            return;
        }

        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║ STUDENT LIST ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.printf("║ %-5s %-10s %-20s %-10s \n", "ID", "NAME", "AVERAGE", "GRADE");
        System.out.println("╠════════════════════════════════════════════════════╣");
        for (Student student : students) {
            System.out.printf("║ %s \n", student.toString());
        }
        System.out.println("╚════════════════════════════════════════════════════╝");
        System.out.println("Total students: " + students.size());
    }

    // Display ranking
    public void displayRanking() {
        if (students.isEmpty()) {
            System.out.println("📋 No students found!");
            return;
        }

        // Sort by average (descending)
        ArrayList<Student> sorted = new ArrayList<>(students);
        sorted.sort((s1, s2) -> Double.compare(s2.calculateAverage(), s1.calculateAverage()));

        System.out.println("\n╔════════════════════════════════════════════════════╗");
        System.out.println("║ STUDENT RANKING ║");
        System.out.println("╠════════════════════════════════════════════════════╣");
        System.out.printf("║ %-5s %-10s %-20s %-10s \n", "RANK", "ID", "NAME", "AVERAGE");
        System.out.println("╠════════════════════════════════════════════════════╣");
        for (int i = 0; i < sorted.size(); i++) {
            Student s = sorted.get(i);
            System.out.printf("║ %-5d %-10s %-20s %-10.2f \n", (i + 1), s.getId(), s.getName(), s.calculateAverage());
        }
        System.out.println("╚════════════════════════════════════════════════════╝");
    }

    // Find top student
    public Student findTopStudent() {
        if (students.isEmpty())
            return null;

        Student top = students.get(0);
        for (Student student : students) {
            if (student.calculateAverage() > top.calculateAverage()) {
                top = student;
            }
        }

        return top;
    }

    // Calculate class average
    public double calculateClassAverage() {
        if (students.isEmpty())
            return 0.0;

        double sum = 0;
        for (Student student : students) {
            sum += student.calculateAverage();
        }

        return sum / students.size();
    }

    // Export to file
    public void exportToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("STUDENT GRADE REPORT");
            writer.println("=".repeat(60));
            writer.println();

            for (Student student : students) {
                writer.println("Student ID: " + student.getId());
                writer.println("Name: " + student.getName());
                writer.println("Grades: ");

                for (Map.Entry<String, Double> entry : student.getGrades().entrySet()) {
                    writer.printf(" %20s : %.2f\n", entry.getKey(), entry.getValue());
                }

                writer.printf("Average: %.2f (%s)\n", student.calculateAverage(), student.getLetterGrade());
                writer.println("-".repeat(60));
                writer.println();
            }

            writer.println("Class Average: " + calculateClassAverage());

            System.out.println("✅ Data exported to " + filename);
        } catch (Exception e) {
            System.out.println("❌ Error exporting file: " + e.getMessage());
        }
    }

    public int getStudentCount() {
        return students.size();
    }
}

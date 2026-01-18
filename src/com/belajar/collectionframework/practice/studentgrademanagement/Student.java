package com.belajar.collectionframework.practice.studentgrademanagement;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String name;
    private HashMap<String, Double> grades; // Subject -> Grade

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new HashMap<>();
    }

    // Add grade for subject
    public void addGrade(String subject, double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.put(subject, grade);
            System.out.println("Grade added: " + subject + " = " + grade);
        } else {
            System.out.println("Invalid grade! Must be 0-100");
        }
    }

    // Get grade for subject
    public double getGrade(String subject) {
        return grades.getOrDefault(subject, 0.0);
    }

    // Calculate average of all grades
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (double grade : grades.values()) {
            sum += grade;
        }

        return sum / grades.size();
    }

    // Get letter grade based on average
    public String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90)
            return "A";
        if (avg >= 80)
            return "B";
        if (avg >= 70)
            return "C";
        if (avg >= 60)
            return "D";
        return "F";
    }

    // Display info
    public void displayInfo() {
        System.out.println("\n╔══════════════════════════════════════╗");
        System.out.println("║ Student ID: " + id);
        System.out.println("║ Name: " + name);
        System.out.println("╠══════════════════════════════════════╣");
        System.out.println("║ Grades:");

        if (grades.isEmpty()) {
            System.out.println("║ No grades ye");
        } else {
            for (Map.Entry<String, Double> entry : grades.entrySet()) {
                System.out.printf("║ %-20s : %.2f\n", entry.getKey(), entry.getValue());
            }
        }

        System.out.println("╠══════════════════════════════════════╣");
        System.out.printf("║ Average: %.2f (%s)\n", calculateAverage(), getLetterGrade());
        System.out.println("╚══════════════════════════════════════╝");
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Double> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-20s Avg: %.2f(%s)", id, name, calculateAverage(), getLetterGrade());
    }
}

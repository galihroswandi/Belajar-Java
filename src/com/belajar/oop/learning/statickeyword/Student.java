package com.belajar.oop.learning.statickeyword;

public class Student {
    private String name;
    private static int totalStudents = 0; // shared oleh semua object

    public Student(String name) {
        this.name = name;
        totalStudents++; // increment setiap kali object baru dibuat
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}

class MathUtil {
    // Static method - bisa dipanggil tanpa create object
    public static int square(int num) {
        return num * num;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

class Example {
    private int instanceVar = 10; // Non-Static
    private static int staticVar = 10; // Static

    // Non-Static method
    public void instanceMethod() {
        System.out.println(instanceVar);
        System.out.println(staticVar);
    }

    public static void staticMethod() {
        // System.out.println(instanceVar); ❌Error!
        System.out.println(staticVar); // ✅ OK
    }

    // Static method tidak bisa akses non-static members
    // karena static method dipanggil tanpa object
}

// StaticBlock
class Configuration {
    private static String dbUrl;
    private static String dbUser;

    // Static block - dijalankan sekali saat class dimuat
    static {
        System.out.println("Loading Configuration...");
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        dbUser = "admin";
    }

    public static String getDbUrl() {
        return dbUrl;
    }
}

class Main {
    public static void main(String[] args) {
        new Student("John");
        new Student("Jane");
        new Student("Bob");

        System.out.println(Student.getTotalStudents());
        System.out.println("\nSTATIC KEYWORDS");

        int result = MathUtil.square(5);
        double area = MathUtil.circleArea(10);
        System.out.println(result);
        System.out.println(area);

        System.out.println("\nSTATIC BLOCK");
        System.out.println(Configuration.getDbUrl());
    }
}
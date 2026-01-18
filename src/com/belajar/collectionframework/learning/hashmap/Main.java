package com.belajar.collectionframework.learning.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         * ========================
         * Creating HashMap
         * ========================
         */
        // Create HashMap
        // HashMap<String, Integer> ages = new HashMap<>();

        // // Key type, Value Type
        // HashMap<String, String> capitals = new HashMap<>();
        // HashMap<Integer, Person> users = new HashMap<>();

        /**
         * ========================
         * Basic operations
         * ========================
         */
        // HashMap<String, Integer> scores = new HashMap<>();

        // // Put key-value pair
        // scores.put("Jhon", 85);
        // scores.put("Jane", 92);
        // scores.put("Bob", 78);

        // // Get value by key
        // int jhonScore = scores.get("Jhon");
        // System.out.println("\nJhon score: " + jhonScore);

        // // Get with default value if key not exists
        // int aliceScore = scores.getOrDefault("Alice", 0);
        // System.out.println("\nAlice score: " + aliceScore);

        // // Check if key exists
        // boolean hasJohn = scores.containsKey("Jhon");
        // System.out.println("\nHas Jhon: " + hasJohn);

        // // Remove by key
        // scores.remove("Bob");
        // System.out.println("\nScores: " + scores);

        // // Size
        // byte size = (byte) scores.size();
        // System.out.println("\nSize: " + size);

        // // Update value
        // scores.put("Jhon", 90);
        // System.out.println("\nScores: " + scores);

        // // Clear all
        // scores.clear();
        // System.out.println("\nScores: " + scores);

        // // Check if empty
        // boolean empty = scores.isEmpty();
        // System.out.println("\nEmpty: " + empty);

        /**
         * ========================
         * Iterating HashMap
         * ========================
         */
        // HashMap<String, Integer> scores = new HashMap<>();
        // scores.put("John", 85);
        // scores.put("Jane", 92);
        // scores.put("Bob", 78);

        // // Method 1: Iterate keys
        // System.out.println("\nKeys: ");
        // scores.values().forEach(score -> System.out.println(score));

        // // Method 2: Iterate values
        // System.out.println("\nValues: ");
        // for (Integer score : scores.values()) {
        // System.out.println(score);
        // }

        // // Method 3: Iterate entries (key-value pairs)
        // System.out.println("\nEntries: ");
        // for (Map.Entry<String, Integer> entry : scores.entrySet()) {
        // System.out.println(entry.getKey() + ": " + entry.getValue());
        // }

        // // Method 4: forEach with lambda
        // System.out.println("\nForEach: ");
        // scores.forEach((name, score) -> {
        // System.out.println(name + ": " + score);
        // });

        /**
         * ========================================
         * HashMap with Custom Objects
         * ========================================
         */
        // Use student ID as key
        // HashMap<String, Student> students = new HashMap<>();
        // students.put("STU001", new Student("John", 3.5));
        // students.put("STU002", new Student("Jane", 3.8));
        // students.put("STU003", new Student("Bob", 3.2));

        // // Get student by ID
        // System.out.println("\nGet student by ID: ");
        // Student john = students.get("STU001");
        // System.out.println(john.getName() + ": " + john.getGpa());

        // // Find all students with GPA > 3.5
        // System.out.println("\nGPA > 3.5: ");
        // for (Student student : students.values()) {
        // if (student.getGpa() > 3.5) {
        // System.out.println(student.getName() + ": " + student.getGpa());
        // }
        // }
    }
}

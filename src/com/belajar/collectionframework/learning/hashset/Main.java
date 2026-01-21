package com.belajar.collectionframework.learning.hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /**
         * ========================
         * HashSet
         * ========================
         */
        // Createing HashSet
        // HashSet<String> uniqueNames = new HashSet<>();
        // HashSet<Integer> uniqueNumbers = new HashSet<>();

        /**
         * ========================
         * Basic operations
         * ========================
         */
        // HashSet<String> tags = new HashSet<>();

        // // Add elements
        // tags.add("Java");
        // tags.add("Python");
        // tags.add("JavaScript");
        // tags.add("Java"); // Duplicate ignored!

        // System.out.println("\nTags: " + tags);

        // // Contains
        // boolean hasJava = tags.contains("Java"); // true

        // // Remove
        // tags.remove("Python");

        // // Size
        // int size = tags.size();
        // System.out.println("\nSize: " + size + "\nHasJava: " + hasJava);

        // // Clear
        // tags.clear();

        /**
         * ===============================
         * Use Case: Remove Dupliceates
         * ===============================
         */
        // // Remove duplicates from ArrayList
        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(2);
        // numbers.add(3);
        // numbers.add(3);
        // numbers.add(4);

        // // Convert to HashSet (removes duplicates)
        // HashSet<Integer> unique = new HashSet<>(numbers);
        // System.out.println(unique);

        // // Convert back to ArrayList if needed
        // ArrayList<Integer> result = new ArrayList<>(unique);
        // System.out.println(result);
    }
}

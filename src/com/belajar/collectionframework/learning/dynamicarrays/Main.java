package com.belajar.collectionframework.learning.dynamicarrays;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /**
         * =========================================================
         * Creating ArrayList
         * =========================================================
         */
        // // Create empty array list
        // ArrayList<String> names = new ArrayList<>();

        // // Create with initiali capacity
        // ArrayList<Integer> numbers = new ArrayList<>();

        // // Create with another collection
        // ArrayList<String> copy = new ArrayList<>(names);

        /**
         * =========================================================
         * Basic operations
         * =========================================================
         */
        // ArrayList<String> fruits = new ArrayList<>();

        // // Add elements
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Orange");
        // fruits.add(1, "Mango");

        // // Get element
        // String first = fruits.get(0);

        // // Set element (Replace)
        // fruits.set(0, "Grape");

        // // Remove element
        // fruits.remove(1); // remove index 1
        // fruits.remove("Banana"); // Remove by value

        // // Size
        // int size = fruits.size();

        // // Check if empty
        // boolean empty = fruits.isEmpty();

        // // Check if contains
        // boolean has = fruits.contains("Grape");

        // // Clear all
        // fruits.clear();

        /**
         * =========================================================
         * Interating ArrayList
         * =========================================================
         */
        // ArrayList<String> names = new ArrayList<>();
        // names.add("John");
        // names.add("Jane");
        // names.add("Bob");

        // // Method 1 : For Loop
        // System.out.println("\nMethod 1 : For Loop");
        // for (int i = 0; i < names.size(); i++) {
        // System.out.println(names.get(i));
        // }

        // // Method 2 : Enhanced for (for-each)
        // System.out.println("\nMethod 2 : Enhanced for (for-each)");
        // for (String name : names) {
        // System.out.println(name);
        // }

        // // Method 3 : forEach with lambda (Java 8+)
        // System.out.println("\nMethod 3 : forEach with lambda (Java 8+)");
        // names.forEach(name -> System.out.println(name));

        // // Method 4 : Iterator
        // System.out.println("\nMethod 4 : Iterator");
        // Iterator<String> iterator = names.iterator();
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        /**
         * =========================================================
         * ArrayList with Custom Objects
         * =========================================================
         */
        // Use ArrayList with Person
        // ArrayList<Person> people = new ArrayList<>();
        // people.add(new Person("John", 25));
        // people.add(new Person("Jane", 30));
        // people.add(new Person("Bob", 22));

        // // Print all
        // people.forEach(name -> System.out.println(name)); // Uses toString()

        // // Find person by name
        // Person found = null;
        // for (Person person : people) {
        // if (person.getName().equals("Jane")) {
        // found = person;
        // break;
        // }
        // }
        // System.out.println("\nFound : " + found);

        /**
         * =========================================================
         * ArrayList Utility Methods
         * =========================================================
         */
        // ArrayList<Integer> numbers = new ArrayList<>();
        // numbers.add(5);
        // numbers.add(2);
        // numbers.add(8);
        // numbers.add(1);
        // numbers.add(9);

        // // Sort ascending
        // System.out.println("\nSort ascending");
        // Collections.sort(numbers);
        // System.out.println(numbers);

        // // Sort descending
        // System.out.println("\nSort descending");
        // Collections.sort(numbers, Collections.reverseOrder());
        // System.out.println(numbers);

        // // Shuffle
        // System.out.println("\nShuffle");
        // Collections.shuffle(numbers);
        // System.out.println(numbers);

        // // Reverse
        // Collections.reverse(numbers);

        // // Max & Min
        // int max = Collections.max(numbers);
        // int min = Collections.min(numbers);

        // // Find all with same value
        // Collections.fill(numbers, 0);

        // // Frequency (count occurences)
        // int count = Collections.frequency(numbers, 0);

        // System.out.println("\nMax : " + max);
        // System.out.println("Min : " + min);
        // System.out.println("Count : " + count);
    }

}

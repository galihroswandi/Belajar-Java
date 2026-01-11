package com.belajar.looparray;

// import java.util.Scanner;

public class LoopToExcercise {
    public static void main(String[] args) {
        // Basic for loop
        // for (int i = 1; i < 5; i++) {
        // System.out.println("Iteration: " + i);
        // }

        /**
         * =========================================================
         * For loop variants:
         * =========================================================
         */
        // Countdown
        // for (byte i = 10; i > 0; i--) {
        // System.out.println(i);
        // }

        // Skip values increment by 2
        // for (byte i = 0; i < 10; i += 2) {
        // System.out.println(i);
        // }

        // Multiple variables
        // for (byte i = 0, j = 10; i < j; i++, j--) {
        // System.out.println("i: " + i + ", j: " + j);
        // }

        /**
         * =========================================================
         * Nested for loop
         * =========================================================
         */
        // for (byte i = 1; i <= 5; i++) {
        // for (byte j = 1; j <= 5; j++) {
        // System.out.print(i * j + "\t");
        // }
        // System.out.println();
        // }

        // Pattern printing
        // for (byte i = 1; i <= 4; i++) {
        // for (byte j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        /**
         * =========================================================
         * While loop
         * =========================================================
         */
        // byte i = 0;
        // while (i < 5) {
        // System.out.println("Iteration: " + i);
        // i++;
        // }

        // Example input validation
        // Scanner scanner = new Scanner(System.in);
        // byte age = -1;

        // while (age < 0 || age > 150) {
        // System.out.println("Enter valid age (0-150): ");
        // age = scanner.nextByte();

        // if (age < 0 || age > 150) {
        // System.out.println("Invalid age! Try again.");
        // }
        // }

        // System.out.println("Age accepted: " + age);
        // scanner.close();

        /**
         * =========================================================
         * Do while loop
         * =========================================================
         */
        // byte i = 0;
        // do {
        // System.out.println("Count: " + i);
        // i++;
        // } while (i < 5);

        // String choice;
        // do {
        // System.out.println("\n=== MENU ===");
        // System.out.println("1. Option One");
        // System.out.println("2. Option Two");
        // System.out.println("3. Exit");
        // System.out.println("Choose: ");
        // choice = scanner.next();
        // } while (!choice.equals("3"));

        /**
         * =========================================================
         * Break and Continue
         * =========================================================
         */
        // Exit whend found
        // for (byte i = 0; i < 10; i++) {
        // if (i == 5) {
        // break;
        // }
        // System.out.println(i);
        // }

        // Search in array
        // String[] names = { "Jhon", "Jane", "Bob", "Alice" };
        // String search = "Bob";
        // boolean found = false;

        // for (byte i = 0; i < names.length; i++) {
        // if (names[i].equals(search)) {
        // System.out.println("Found at index: " + i);
        // found = true;
        // break;
        // }
        // }

        // if (!found) {
        // System.out.println("Not found");
        // }

        // Skip even numbers
        // for (byte i = 0; i < 10; i++) {
        // if (i % 2 == 0) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // Skip negative numbers
        // byte[] numbers = { 1, -2, 3, -4, 5, -6 };
        // byte sum = 0;

        // for (byte num : numbers) {
        // if (num < 0) {
        // continue;
        // }

        // sum += num;
        // }

        // System.out.println("Sum of positive: " + sum);

        // labeled break
        // outerLoop: for (byte i = 0; i < 3; i++) {
        // for (byte j = 0; j < 3; j++) {
        // if (i == 1 && j == 1) {
        // break outerLoop;
        // }
        // System.out.println("i=" + i + ", j=" + j);
        // }
        // }
    }
}

package com.belajar.looparray.practice;

public class PatternPrinting {
    public static void main(String[] args) {
        System.out.println("1. Right Triangle");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n2. Inverted Triangle");
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n3. Pyramid");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n4. Diamond");
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int j = n - 1; j >= 1; j--) {
            for (int k = 1; k <= n - j; k++) {
                System.out.print(" ");
            }

            for (int l = 1; l <= (2 * j - 1); l++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

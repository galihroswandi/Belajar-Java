package com.belajar.oop.learning.methodoverloading;

public class Calculator {
    // Add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    public double add(double a, double b) {
        return a + b;

    }

    // Add array of integers
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 15));
        System.out.println(calc.add(5.5, 10.5));
        System.out.println(calc.add(new int[] { 1, 2, 3 }));
    }
}

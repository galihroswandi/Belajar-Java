package com.belajar.java;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;

        while (isContinue) {
            System.out.println("=== TEMPERATURE CONVERTER ===");

            System.out.println("\nOption menu converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celcius to Kelvin");

            System.out.println("\nEnter your choosing (1,2,3):");
            byte option = scanner.nextByte();

            System.out.println("Enter your temperature value:");
            float inputTemperature = scanner.nextFloat();

            switch (option) {
                case 1:
                    float fahrenheit = (inputTemperature * 9 / 5) + 32;
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", inputTemperature, fahrenheit);
                    break;

                case 2:
                    float celsius = (inputTemperature - 32) * 5 / 9;
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", inputTemperature, celsius);
                    break;

                case 3:
                    float kelvin = inputTemperature + 273.15f;
                    System.out.println("%.2f Celsius = %.2f Kelvin%n".formatted(inputTemperature, kelvin));
                    break;

                default:
                    System.out.println("Option not available");
                    break;
            }

            System.out.println("\nContinue convert temperature? (yes/no):");
            isContinue = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using the temperature converter.");
        scanner.close();
    }
}

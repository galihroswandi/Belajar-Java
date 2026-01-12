package com.belajar.fundamental.practice;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("=== BMI Calculator ===");
        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;

        while (isContinue) {
            System.out.println("Enter your weight in kg: ");
            float weight = scanner.nextFloat();

            System.out.println("Enter your height in meters: ");
            float height = scanner.nextFloat();

            float resultBmi = weight / (height * height);

            if (resultBmi < 18.5) {
                System.out.println("Your BMI is " + resultBmi + ", you are underweight.");
            } else if (resultBmi >= 18.5 && resultBmi <= 24.9) {
                System.out.println("You BMI is " + resultBmi + ", you are normal weight.");
            } else if (resultBmi >= 25 && resultBmi <= 29.9) {
                System.out.println("Your BMI is " + resultBmi + ", you are overweight.");
            } else if (resultBmi >= 30) {
                System.out.println("Your BMI is " + resultBmi + ", you are obase.");
            }

            System.out.println("\nDo you want to calculate again? (yes/no)");
            isContinue = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using the BMI Calculator.");
        scanner.close();
    }
}

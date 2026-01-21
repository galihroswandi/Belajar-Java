package com.belajar.fundamental;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====GRADE CALCULATOR=====");

        String isContinue = "yes";

        while (isContinue.equals("yes")) {
            System.out.println("Enter your score:");
            double score = sc.nextDouble();

            String grade;
            boolean status = true;

            if (score >= 90 && score <= 100) {
                grade = "A";
                status = true;
            } else if (score >= 80 && score < 90) {
                grade = "B";
                status = true;
            } else if (score >= 70 && score < 80) {
                grade = "C";
                status = true;
            } else if (score >= 60 && score < 70) {
                grade = "D";
                status = false;
            } else {
                grade = "F";
                status = false;
            }

            System.out.printf("Your grade is %s, and %s\n", grade, (status ? "you PASSED" : "you FAILED"));

            System.out.println("\nDo you want to continue? (yes/no)");
            isContinue = sc.next();
        }

        System.out.println("Thank you for using Grade Calculator");
        sc.close();
    }
}

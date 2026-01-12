package com.belajar.looparray.practice;

import java.util.Arrays;
import java.util.Scanner;

public class GuessTheNumber {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int secretNumber = 9;
        int[] historyGuess = new int[7];
        boolean isContinue = true;
        boolean isWin = false;

        while (isContinue) {
            System.out.println("\n╔═════════════════════════════╗");
            System.out.println("║ SIMPLE NUMBER GUESSING GAME ║");
            System.out.println("╚═════════════════════════════╝");

            for (int i = 0; i < historyGuess.length; i++) {
                System.out.println("Tebak angka (1-100) [" + (i + 1) + "/7]");
                int guessNumber = scanner.nextInt();

                historyGuess[i] = guessNumber;

                if (secretNumber == guessNumber) {
                    System.out.println("★ Benar anda menang!.");
                    isWin = true;
                    break;
                } else if (guessNumber > secretNumber) {
                    System.out.println("Too high (Terlalu Tinggi)");
                } else {
                    System.out.println("Too low (Terlalu rendah)");
                }

                System.out.print("History Input: ");
                for (int j = 0; j <= i; j++) {
                    System.out.print("[" + historyGuess[j] + "] ");
                }
                System.out.println("\n");
            }

            if (!isWin) {
                System.err.println("Maaf, Anda telah mencapai batas penembakan, Anda kalah!");
            }

            scanner.nextLine();
            System.out.println("Dou you want continue?(y/n)");
            boolean newContinue = scanner.next().equals("y");

            isContinue = newContinue;

            if (newContinue) {
                Arrays.fill(historyGuess, -1);
            }
        }
    }
}

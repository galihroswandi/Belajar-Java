package com.belajar.oop.learning.encapsulation;

public class BankAccount {
    // Encapsulation
    private double balance; // Private = only accessible within this class

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

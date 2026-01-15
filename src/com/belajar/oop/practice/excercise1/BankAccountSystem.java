package com.belajar.oop.practice.excercise1;

public class BankAccountSystem {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccountSystem(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            System.out.println("❌ Account number cannot be empty!");
            return;
        }

        if (accountNumber.length() != 10) {
            System.out.println("❌ Account number must be 10 digits!");
            return;
        }

        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        if (holderName == null || holderName.trim().isEmpty()) {
            System.out.println("❌ Holder name cannot be empty!");
            return;
        }
        this.holderName = holderName;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("❌ Balance cannot be negative!");
            return;
        }

        if (balance > 1000000) {
            System.out.println("❌ Balance cannot be greater than 1,000,000!");
            return;
        }

        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("Account Number: %s\nHolder Name: %s\nBalance: %.2f", accountNumber, holderName, balance);
    }
}

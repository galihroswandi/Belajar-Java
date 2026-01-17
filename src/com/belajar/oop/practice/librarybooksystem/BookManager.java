package com.belajar.oop.practice.librarybooksystem;

import java.util.Scanner;

public class BookManager {
    private Book book = new Book(9780596007126L, "Java Programming", "John Doe", true);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager instanceBookManager = new BookManager();

        boolean running = false;

        while (!running) {
            System.out.println("\n╔═══════════════════════════════════╗");
            System.out.println("║ LIBRARY BOOK SYSTEM               ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Display Book Info");
            System.out.println("4. Exit");
            System.out.println("Choose option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n=== BORROW BOOK ===");
                    System.out.print("Enter ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();

                    instanceBookManager.borrowBook(isbn, title, author);
                    break;

                case 2:
                    System.out.println("\n=== RETURN BOOK ===");
                    System.out.print("Enter ISBN: ");
                    isbn = scanner.nextLong();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter title: ");
                    title = scanner.nextLine();

                    System.out.print("Enter author: ");
                    author = scanner.nextLine();

                    instanceBookManager.returnBook(isbn, title, author);
                    break;

                case 3:
                    System.out.println("\n=== DISPLAY BOOK INFO ===");
                    instanceBookManager.displayBookInfo();
                    break;

                case 4:
                    System.out.println("\n=== EXIT ===");
                    running = true;
                    scanner.close();
                    break;

                default:
                    System.err.println("❌ Invalid option!");
                    scanner.close();
                    break;
            }
        }
    }

    public void borrowBook(long isbn, String title, String author) {
        if (book.getAvailable()) {
            book.setAvailable(false);
            System.out.println("Buku berhasil dipinjam!");
        } else {
            System.err.println("❌ Buku sedang dipinjam!");
        }
    }

    public void returnBook(long isbn, String title, String author) {
        if (!book.getAvailable()) {
            book.setAvailable(true);
            System.out.println("Buku berhasil dikembalikan!");
        } else {
            System.err.println("❌ Buku sedang dipinjam!");
        }
    }

    public void displayBookInfo() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║ LIBRARY BOOK SYSTEM               ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ ISBN: " + book.getIsbn());
        System.out.println("║ Title: " + book.getTitle());
        System.out.println("║ Author: " + book.getAuthor());
        System.out.println("║ Available: " + book.getAvailable());
        System.out.println("╚═══════════════════════════════════╝");
    }
}

package com.belajar.oop.practice.cms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager(100);

        boolean running = true;

        while (running) {
            System.out.println("\n╔═══════════════════════════════════╗");
            System.out.println("║ CONTACT MANAGEMENT SYSTEM         ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.println("1. Add contact");
            System.out.println("2. Search contact");
            System.out.println("3. Update contact");
            System.out.println("4. Delete contact");
            System.out.println("5. Display All Contacts");
            System.out.println("6. Exit");
            System.out.println("Choose option (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n=== ADD NEW CONTACT ===");
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();

                    manager.addContact(name, phone, email);
                    break;

                case 2:
                    System.out.println("\n=== SEARCH CONTACT ===");
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();

                    Contact found = manager.searchContact(searchName);
                    if (found != null) {
                        System.out.println("\n✅ Contact found");
                        found.displayInfo();
                    } else {
                        System.err.println("❌ Contact not found");
                    }
                    break;

                case 3:
                    System.out.println("\n=== UPDATE CONTACT ===");
                    System.out.print("Enter name of contact to update: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter a new phone: ");
                    String newPhone = scanner.nextLine();

                    System.out.print("Enter a new email: ");
                    String newEmail = scanner.nextLine();

                    manager.updateContact(updateName, newPhone, newEmail);
                    break;

                case 4:
                    System.out.println("\n=== DELETE CONTACT ===");
                    System.out.print("Enter name of contact to delete: ");
                    String deleteName = scanner.nextLine();

                    System.out.print("Are you sure? (yes/no): ");
                    String confirm = scanner.nextLine();

                    if (confirm.equalsIgnoreCase("yes")) {
                        manager.deleteContact(deleteName);
                    } else {
                        System.err.println("❌ Contact not deleted");
                    }
                    break;

                case 5:
                    manager.displayAllContacts();
                    break;

                case 6:
                    System.out.println("\n👋 Thank you for using Contact Management System!");
                    System.out.println("Goodbye!");
                    running = false;
                    scanner.close();
                    break;

                default:
                    System.out.println("❌ Invalid option! Please choose a valid option.");
                    break;
            }

        }

    }
}

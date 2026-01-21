package com.belajar.collectionframework.practice.phonebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        boolean running = true;

        while(running){
            System.out.println("\n╔═══════════════════════════════════════╗");
            System.out.println("║ PHONE BOOK                            ║");
            System.out.println("╚═══════════════════════════════════════╝");
            System.out.println("1. Add Phone");
            System.out.println("2. Find by name");
            System.out.println("3. Update phone number");
            System.out.println("4. Delete contact");
            System.out.println("5. Display all contact");
            System.out.println("6. Exit");
            System.out.print("Choose option (1-9): ");

            byte choice = scanner.nextByte();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNum = scanner.nextLine();

                    manager.addContact(name, phoneNum);
                    break;

                case 2:
                    System.out.print("Enter name: ");
                    String findName = scanner.nextLine();

                    manager.findByName(findName);
                    break;

                case 3:
                    System.out.print("Enter name: ");
                    String updateName = scanner.nextLine();

                    System.out.print("Enter phone: ");
                    String updatePhone = scanner.nextLine();

                    manager.updatePhoneNumber(updateName, updatePhone);
                    break;

                case 4:
                    System.out.print("Enter name: ");
                    String deleteName = scanner.nextLine();

                    System.out.println("Are you sure? (y/n)");
                    if(scanner.nextLine().equals("y")){
                        manager.deleteContact(deleteName);
                    }
                    break;

                case 5:
                    manager.displayAllContact();
                    break;

                case 6:
                    System.out.println("Goodbye, Thank you for using phonebook! See you:)");
                    running = false;
                    scanner.close();
                    break;

                default:
                    System.out.println("Invalid option!");
                    running = false;
                    scanner.close();
                    break;
            }
        }
    }
}

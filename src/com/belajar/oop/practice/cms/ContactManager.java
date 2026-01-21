package com.belajar.oop.practice.cms;

public class ContactManager {
    private Contact[] contacts;
    private int count;

    // Constructor
    public ContactManager(int capacity) {
        contacts = new Contact[capacity];
        count = 0;
    }

    // Add contact
    public boolean addContact(String name, String phone, String email) {
        // Check if array is full
        if (count >= contacts.length) {
            System.err.println("❌ Contact list is full!");
            return false;
        }

        // Check duplicate name
        if (findContactIndex(name) != -1) {
            System.err.println("❌ Contact with name " + name + " already exists!");
            return false;
        }

        // Validate email
        if (!email.contains("@") || !email.contains(".")) {
            System.err.println("❌ Invalid email!");
            return false;
        }

        // Validate phone
        if (!phone.matches("\\d+")) {
            System.err.println("❌ Phone must contain only numbers!");
            return false;
        }

        // Add contact
        contacts[count] = new Contact(name, phone, email);
        count++;
        System.out.println("✅ Contact added successfully!");
        return true;
    }

    // Find contact index by name
    private int findContactIndex(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Search contact by name
    public Contact searchContact(String name) {
        int index = findContactIndex(name);
        if (index != -1) {
            return contacts[index];
        }

        return null;
    }

    // Update contact
    public boolean updateContact(String name, String newPhone, String newEmail) {
        int index = findContactIndex(name);
        if (index == -1) {
            System.err.println("❌ Contact not found!");
            return false;
        }

        contacts[index].setPhone(newPhone);
        contacts[index].setEmail(newEmail);
        System.out.println("✅ Contact updated successfully!");
        return true;
    }

    // Delete contact
    public boolean deleteContact(String name) {
        int index = findContactIndex(name);
        if (index == -1) {
            System.out.println("❌ Contact not found!");
            return false;
        }

        // Shift elemens
        for (int i = index; i < count - 1; i++) {
            contacts[i] = contacts[i + 1];
        }

        contacts[count - 1] = null;
        count--;
        System.out.println("✅ Contact deleted successfully!");
        return true;
    }

    // Display all contacts
    public void displayAllContacts() {
        if (count == 0) {
            System.out.println("❌ Contact list is empty!");
            return;
        }

        System.out.println("\n╔════════════════════════════════════════════════════════════════╗");
        System.out.println("║                    CONTACT LIST                                ║");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");
        System.out.printf("║ %-20s %-15s %-30s ║\n", "NAME", "PHONE", "EMAIL");
        System.out.println("╠════════════════════════════════════════════════════════════════╣");

        for (int i = 0; i < count; i++) {
            System.out.printf("║ %s ║\n", contacts[i].toString());
        }

        System.out.println("╚════════════════════════════════════════════════════════════════╝");
        System.out.println("Total contacts: " + count);
    }

    // get total contacts
    public int getTotalContacts() {
        return count;
    }
}

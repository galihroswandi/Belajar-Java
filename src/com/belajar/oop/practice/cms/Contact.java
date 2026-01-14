package com.belajar.oop.practice.cms;

public class Contact {
    private String name;
    private String phone;
    private String email;

    // Constructor
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Setter with validation
    public void setName(String name) {
        if (name != null && name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.err.println("❌ Name cannot be empty!");
        }
    }

    public void setPhone(String phone) {
        if (phone != null && phone.matches("\\d+")) {
            this.phone = phone;
        } else {
            System.err.println("❌ Phone must contain only numbers!");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.err.println("❌ Invalid email!");
        }
    }

    // Display contact info
    public void displayInfo() {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ Name : " + name);
        System.out.println("│ Phone : " + phone);
        System.out.println("│ Email : " + email);
        System.out.println("└─────────────────────────────┘");
    }

    // toString for easy printing
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-30s", name, phone, email);
    }
}

package com.belajar.oop.practice.productinventory;

import java.util.Scanner;

public class ProductManager {
    Product products = new Product(1, "Product 1", 10000);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager instanceManager = new ProductManager();

        boolean running = true;

        while (running) {
            System.out.println("\n╔═══════════════════════════════════╗");
            System.out.println("║ PRODUCT MANAGEMENT SYSTEM         ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.println("1. Add stock");
            System.out.println("2. Reduce Stock");
            System.out.println("3. Apply discount");
            System.out.println("4. Display Product");
            System.out.println("5. Exit");
            System.out.print("Choose option (1-2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n=== ADD STOCK ===");
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();

                    instanceManager.addStock(quantity);
                    break;

                case 2:
                    System.out.println("\n=== REDUCE STOCK ===");
                    System.out.print("Enter quantity: ");
                    quantity = scanner.nextInt();

                    instanceManager.reduceStock(quantity);
                    break;

                case 3:
                    System.out.println("\n=== APPLY DISCOUNT ===");
                    System.out.print("Enter discount percentage (0-100%): ");
                    int percentage = scanner.nextInt();

                    instanceManager.applyDiscount(percentage);
                    break;

                case 4:
                    System.out.println("\n=== DISPLAY PRODUCT ===");
                    instanceManager.displayProduct();
                    break;

                case 5:
                    System.out.println("\n❌ Exiting...");
                    running = false;
                    scanner.close();
                    break;

                default:
                    System.err.println("❌ Invalid choice!");
                    running = false;
                    scanner.close();
                    break;
            }
        }
    }

    public void addStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("❌ Quantity must be greater than 0!");
            return;
        }

        products.setStock(quantity);
        System.out.println("✅ Stock added successfully!");
        System.out.println("Stock: " + products.getStock());
    }

    public void reduceStock(int quantity) {
        if (quantity <= 0) {
            System.out.println("❌ Quantity must be greater than 0!");
            return;
        }

        if (products.getStock() < quantity) {
            System.out.println("❌ Not enough stock!");
            return;
        }

        products.setStock(products.getStock() - quantity);
        System.out.println("✅ Stock reduced successfully!");
        System.out.println("Stock: " + products.getStock());
    }

    public void applyDiscount(int percentage) {
        int discount = products.getPrice() * percentage / 100;
        int newPrice = products.getPrice() - discount;
        products.setPrice(newPrice);
        System.out.println("✅ Discount applied successfully!");
        System.out.println("New price: " + products.getPrice());
    }

    public void displayProduct() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║ PRODUCT MANAGEMENT SYSTEM         ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ Product Name: " + products.getName());
        System.out.println("║ Product Price: " + products.getPrice());
        System.out.println("║ Product Stock: " + products.getStock());
        System.out.println("╚═══════════════════════════════════╝");
    }
}

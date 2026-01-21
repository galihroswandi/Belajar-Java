package com.belajar.oop.practice.shoppingcartadvance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart((byte) 100);
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Shopping Cart ===");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Display Cart");
            System.out.println("4. Calculate Grand Total");
            System.out.println("5. Apply Discount");
            System.out.println("6. Checkout");
            System.out.println("7. Exit");
            System.out.print("Choose option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.println("\n=== ADD PRODUCT ===");
                    System.out.print("Enter a name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter a price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter a qty: ");
                    int qty = scanner.nextInt();
                    scanner.nextLine();

                    cart.addProduct(new Product(name, price, qty));
                    break;

                case 2:
                    System.out.println("\n=== REMOVE PRODUCT ===");
                    System.out.print("Enter a product id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    cart.removeProduct(id);
                    break;

                case 3:
                    System.out.println("\n=== DISPLAY CART ===");
                    cart.displayCart();
                    break;

                case 4:
                    cart.calculateGrandTotal(true);
                    break;

                case 5:
                    System.out.println("\n=== APPLY DISCOUNT ===");
                    System.out.print("Enter a product id: ");
                    id = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter a percentage discount: ");
                    double percentage = scanner.nextDouble();
                    scanner.nextLine(); // clear buffer

                    cart.applyDiscount(id, percentage);
                    break;

                case 7:
                    System.out.println("Thank you for using the Shopping Cart.");
                    running = false;
                    scanner.close();
                    break;

                case 6:
                    System.out.println("\n=== CHECKOUT ===");
                    System.out.println("Are you sure? (y/n)");
                    boolean confirmation = scanner.nextLine().equals("y");
                    if (confirmation) {
                        cart.checkout();
                    }
                    break;

                default:
                    running = false;
                    scanner.close();
                    break;
            }
        }
    }
}

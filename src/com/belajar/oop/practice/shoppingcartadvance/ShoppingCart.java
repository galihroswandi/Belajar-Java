package com.belajar.oop.practice.shoppingcartadvance;

import java.text.NumberFormat;
import java.util.Locale;

public class ShoppingCart {
    Product[] products;
    int count;
    NumberFormat formatter;

    public ShoppingCart(byte capacity) {
        products = new Product[capacity];
        count = 0;
        Locale locale = Locale.of("id", "ID");
        formatter = NumberFormat.getCurrencyInstance(locale);
    }

    public void addProduct(Product product) {
        products[count] = product;
        count++;
    }

    public void removeProduct(int productId) {
        if (productId == 0) {
            System.out.println("❌ Product not found!");
        }

        for (int i = 0; i < count; i++) {
            if (products[i].getId() == count) {
                products[i] = null;
                count--;

                System.out.println("✅ Product removed successfully!");
            }
        }
    }

    public double calculateGrandTotal(boolean showLog) {
        double grandTotal = 0d;
        for (int i = 0; i < count; i++) {
            grandTotal += products[i].calculateTotalPrice();
        }
        if (showLog) {
            System.out.println("Grand Total: " + formatter.format(grandTotal));
        }
        return grandTotal;
    }

    public void applyDiscount(int productId, double percentage) {
        if (percentage == 0) {
            System.err.println("❌ Percentage must be greater than 0!");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (products[i].getId() == productId) {
                products[i].setPrice(products[i].getPrice() - products[i].getPrice() * percentage / 100);
                System.out.println("✅ Discount applied successfully!");
                System.out.println("New price: " + formatter.format(products[i].calculateTotalPrice()));
                return;
            }
        }
    }

    public void checkout() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║          CHECKOUT                 ║");
        System.out.println("╠═══════════════════════════════════╣");
        System.out.println("║ Receipt ID: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println("╠═══════════════════════════════════╣");
            System.out.println("║ Product Name: " + products[i].getName());
            System.out.println("║ Product Quantity: " + products[i].getQuantity());
            System.out.println("║ Unit Price: " + formatter.format(products[i].getPrice()));
            System.out.println("║ Product Price: " + formatter.format(products[i].calculateTotalPrice()));
            System.out.println("╠═══════════════════════════════════╣");
        }
        System.out.println("║ Grand Total: " + formatter.format(calculateGrandTotal(false)));
        System.out.println("╚═══════════════════════════════════╝");
    }

    public void displayCart() {
        System.out.println("\n╔═══════════════════════════════════╗");
        System.out.println("║          SHOPPING CART            ║");
        System.out.println("╠═══════════════════════════════════╣");
        for (int i = 0; i < count; i++) {
            System.out.println("║ Product Name: " + products[i].getName());
            System.out.println("║ Product Quantity: " + products[i].getQuantity());
            System.out.println("║ Unit Price: " + formatter.format(products[i].getPrice()));
            System.out.println("║ Product Price: " + formatter.format(products[i].calculateTotalPrice()));
            System.out.println("╠═══════════════════════════════════╣");
        }
        System.out.println("║ Grand Total: " + formatter.format(calculateGrandTotal(false)));
        System.out.println("╚═══════════════════════════════════╝");
    }
}

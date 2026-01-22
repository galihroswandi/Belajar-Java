package com.belajar.exception_file_i_o.learning.handlecsv;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteCSV {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("data.csv")) {

            // Write header
            writer.println("Nama,Umur,Kota");

            // Write data
            writer.println("John Doe,25,New York");
            writer.println("Jane Smith,30,London");
            writer.println("Bob Johnson,22,Tokyo");

            System.out.println("✅ File CSV dibuat!");
        } catch (IOException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}

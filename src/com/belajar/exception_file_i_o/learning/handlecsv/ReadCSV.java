package com.belajar.exception_file_i_o.learning.handlecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.csv"))) {

            String baris;
            boolean barisPertama = true;

            while ((baris = reader.readLine()) != null) {
                // lewati header
                if (barisPertama) {
                    System.out.println("Header: " + baris);
                    barisPertama = false;
                    continue;
                }

                // Pisahkan dengan koma
                String[] nilai = baris.split(",");

                System.out.println("Nama: " + nilai[0]);
                System.out.println("Umur: " + nilai[1]);
                System.out.println("Kota: " + nilai[2]);
                System.out.println("---");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package com.belajar.exception_file_i_o.learning.file_i_o;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /**
         * ===================================================================
         * ===================================================================
         * BASIC FILE
         * ===================================================================
         * ===================================================================
         */
        /**
         * ===================================================================
         * INTRODUCTION
         * ===================================================================
         */
        // File file = new File("data.txt");

        // if (file.exists()) {
        // System.out.println("✅ File ada");

        // // File information
        // System.out.println("Nama: " + file.getName());
        // System.out.println("Path: " + file.getAbsolutePath());
        // System.out.println("Ukuran: " + file.length());
        // System.out.println("Bisa baca: " + file.canRead());
        // System.out.println("Bisa ditulis: " + file.canWrite());
        // System.out.println("Adalah file: " + file.isFile());
        // System.out.println("Adalah directory: " + file.isDirectory());

        // } else {
        // System.out.println("❌ File tidak ada");
        // }

        /**
         * ===================================================================
         * CREATE AND DELETE FILE
         * ===================================================================
         */
        // File file = new File("filebaru.txt");
        // try {
        // if (file.createNewFile()) {
        // System.out.println("✅ File dibuat: " + file.getName());
        // } else {
        // System.out.println("File sudah ada");
        // }
        // } catch (IOException e) {
        // System.out.println("❌ Error membuat file: " + file.getName());
        // }

        // // menghapus file
        // if (file.delete()) {
        // System.out.println("✅ File dihapus: " + file.getName());
        // } else {
        // System.out.println("❌ Gagal menghapus file");
        // }

        /**
         * ===================================================================
         * DIRECTORY OPERATION
         * ===================================================================
         */
        // // Create directory
        // File dir = new File("folderSaya");
        // if (dir.mkdir()) {
        // System.out.println("✅ Directori dibuat");
        // }

        // // List file from directory
        // File directory = new File(".");
        // String[] files = directory.list();

        // if (files != null) {
        // System.out.println("File dalam direktori saat ini: ");
        // for (String nameFile : files) {
        // System.out.println("-" + nameFile);
        // }
        // }

        // List with file object
        // File directory = new File(".");
        // File[] objectFile = directory.listFiles();
        // if (objectFile != null) {
        // for (File f : objectFile) {
        // if (f.isFile()) {
        // System.out.println("File: " + f.getName());
        // } else if (f.isDirectory()) {
        // System.out.println("Dir: " + f.getName());
        // }
        // }
        // }

        /**
         * ===================================================================
         * ===================================================================
         * READING FILE
         * ===================================================================
         * ===================================================================
         */
        /**
         * ===================================================================
         * METHOD SCANNER
         * ===================================================================
         */
        // try {
        // File file = new File("data.txt");
        // Scanner scanner = new Scanner(file);

        // while (scanner.hasNextLine()) {
        // String baris = scanner.nextLine();
        // System.out.println(baris);
        // }

        // scanner.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("❌ File tidak ditemukan: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * Buffered Reader (Lebih cepat untuk file besar)
         * ===================================================================
         */
        // try (BufferedReader reader = new BufferedReader(new FileReader("data.txt")))
        // {
        // String baris;
        // while ((baris = reader.readLine()) != null) {
        // System.out.println(baris);
        // }
        // } catch (IOException e) {
        // System.out.println("❌Error membaca file: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * MEMBACA SEMUA BARIS SEKALIGUS
         * ===================================================================
         */
        // try {
        // List<String> baris = Files.readAllLines(Paths.get("data.txt"));

        // for (String line : baris) {
        // System.out.println(line);
        // }

        // // Or with index
        // for (int i = 0; i < baris.size(); i++) {
        // System.out.println((i + 1) + ": " + baris.get(i));
        // }
        // } catch (IOException e) {
        // System.out.println("❌ Error: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * MEMBACA TYPE DATA BERBEDA
         * ===================================================================
         */
        // try (Scanner scanner = new Scanner(new File("angka.txt"))) {
        // // Read integer
        // while (scanner.hasNextInt()) {
        // int num = scanner.nextInt();
        // System.out.println("Angka: " + num);
        // }
        // } catch (Exception e) {
        // System.out.println("❌ Error: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * ===================================================================
         * MENULIS FILE
         * ===================================================================
         * ===================================================================
         */
        /**
         * ===================================================================
         * FileWriter
         * ===================================================================
         */
        // try (FileWriter writer = new FileWriter("output.txt")) {

        // writer.write("Hello, World!\n");
        // writer.write("This is line-2\n");
        // writer.write("This is line-3\n");

        // System.out.println("✅ File writer successful");
        // } catch (IOException e) {
        // System.out.println("❌ Error writing file: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * PrintWriter (Lebih mudah)
         * ===================================================================
         */
        // try (PrintWriter writer = new PrintWriter("output.txt")) {

        // writer.println("Lin 1");
        // writer.println("Line 2");
        // writer.printf("Format: %s, %d, %.2f\n", "Text", 123, 45.67);

        // System.out.println("✅ File berhasil ditulis!");
        // } catch (IOException e) {
        // System.out.println("❌ Error: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * Menambahkan ke File (append)
         * ===================================================================
         */
        // try (FileWriter writer = new FileWriter("output.txt", true)) {
        // writer.write("Baris ini ditambahkan\n");
        // writer.write("Baris tambahan lainnya\n");
        // } catch (IOException e) {
        // System.out.println("❌ Error: " + e.getMessage());
        // }

        /**
         * ===================================================================
         * Menulis beberapa baris
         * ===================================================================
         */
        // ArrayList<String> baris = new ArrayList<>();
        // baris.add("Baris pertama");
        // baris.add("Baris kedua");
        // baris.add("Baris ketiga");

        // try (PrintWriter writer = new PrintWriter("output.txt")) {
        // for (String line : baris) {
        // writer.println(line);
        // }
        // System.out.println("✅ Ditulis " + baris.size() + " baris!");
        // } catch (Exception e) {
        // System.out.println("❌ Error: " + e.getMessage());
        // }
    }
}

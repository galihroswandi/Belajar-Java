package com.belajar.looparray;

public class ArrayToExcercise {
    public static void main(String[] args) {
        /**
         * =========================================================
         * Array declaration and initialization
         * =========================================================
         */
        // deklarasi array
        // int[] numbers;
        // int numbers2[];

        // Inisialisasi dengan ukuran
        // numbers = new int[5];

        // Deklarasi + inisialisasi
        // int[] scores = new int[5];

        // Deklarasi + inisialisasi dengan values
        // int[] ages = { 18, 25, 30, 35 };
        // String[] names = { "Jhon", "Jane", "Bob" };
        // float[] prices = { 19.99f, 29.99f, 39.99f };

        // Mengakses element (index mulai dari nol)
        // System.out.println(names[0]);
        // System.out.println(names[1]);

        // Mengubah nilai
        // names[0] = "Jack";
        // System.out.println(names[0]);

        // Panjang array (read-only)
        // System.out.println(names.length);

        /**
         * =========================================================
         * Looping through array
         * =========================================================
         */
        // For loop dengan array
        // Traditional for loop
        // String[] fruits = { "Apple", "Banana", "Orange", "Mango" };

        // for (byte i = 0; i < fruits.length; i++) {
        // System.out.println("Fruit at index " + i + ": " + fruits[i]);
        // }
        // Reverse loop
        // for (int i = fruits.length - 1; i >= 0; i--) {
        // System.out.println(fruits[i]);
        // }

        // Enhanced for loop (for-each)
        // String[] fruits = { "Apple", "Banan", "Orange" };
        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }

        // When to Use Which Loop?
        // String[] items = { "A", "B", "C", "D", "E" };
        // // Use for-each: Saat hanya perlu baca nilai
        // for (String item : items) {
        // System.out.println(item);
        // }
        // // Use traditional for: Saat perlu index atau modifikasi nilai
        // for (int i = 0; i < items.length; i++) {
        // items[i] = items[i].toLowerCase();
        // System.out.println(items[i]);
        // }

        /**
         * =========================================================
         * Array operations
         * =========================================================
         */
        // ==== Isi array dengan input user ====
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("How many students?");
        // byte size = scanner.nextByte();
        // String[] students = new String[size];
        // int[] scores = new int[size];
        // for (int i = 0; i < size; i++) {
        // System.out.println("Enter student name: ");
        // students[i] = scanner.next();
        // System.out.println("Enter score:");
        // scores[i] = scanner.nextInt();
        // System.out.println("---");
        // System.out.println(Arrays.toString(students));
        // System.out.println(Arrays.toString(scores));
        // }
        // scanner.close();

        // ==== Search in array ====
        // String[] names = { "Jhon", "Jane", "Bob", "Alice" };
        // String search = "Bob";
        //// Linear search
        // byte index = -1;
        // for (int i = 0; i < names.length; i++) {
        // if (names[i].equals(search)) {
        // index = (byte) i;
        // break;
        // }
        // }
        // if (index != -1) {
        // System.out.println("Found at index: " + index);
        // } else {
        // System.out.println("Not found");
        // }

        // ==== Find max and min ====
        // byte[] numbers = { 45, 12, 78, 34, 89, 23 };
        // // Find max
        // byte max = numbers[0];
        // for (byte i = 1; i < numbers.length; i++) {
        // if (numbers[i] > max) {
        // max = numbers[i];
        // }
        // }
        // System.out.println("Max: " + max);
        // // Find min
        // byte min = numbers[0];
        // for (byte i = 1; i < numbers.length; i++) {
        // if (numbers[i] < min) {
        // min = numbers[i];
        // }
        // }
        // System.out.println("Min: " + min);

        // ==== Calculate sum & average ====
        // byte[] scores = { 85, 90, 78, 92, 88 };
        // byte sum = 0;
        // for (byte score : scores) {
        // sum += score;
        // }
        // float average = (float) sum / scores.length;

        // System.out.println("Sum: " + sum);
        // System.out.println("Average: " + average);

        // ==== Copy array ====
        // int[] original = { 1, 2, 4, 4, 5 };

        // // Method 1: Manual copy
        // int[] copy1 = new int[original.length];
        // for (int i = 0; i < original.length; i++) {
        // copy1[i] = original[i];
        // }

        // // Method 2: Arrays.copyOf
        // int[] copy2 = Arrays.copyOf(original, original.length);

        // // Method 3: System.arraycopy
        // int[] copy3 = new int[original.length];
        // System.arraycopy(original, 0, copy3, 0, original.length);

        // System.out.println("Original: " + Arrays.toString(original));
        // System.out.println("Copy1: " + Arrays.toString(copy1));
        // System.out.println("Copy2: " + Arrays.toString(copy2));
        // System.out.println("Copy3: " + Arrays.toString(copy3));

        // ==== Sort array ====
        // int[] numbers = { 5, 2, 8, 1, 9 };
        // // Sort ascending
        // Arrays.sort(numbers);
        // System.out.println("Sorted ascending: " + Arrays.toString(numbers));
        // // Sort string
        // String[] names = { "Charles", "Alice", "Bob" };
        // Arrays.sort(names);
        // System.out.println("Sorted names: " + Arrays.toString(names));

        /**
         * =========================================================
         * =========================================================
         * Array multidimensional
         * =========================================================
         * =========================================================
         */
        // // Declaration
        // int[][] matrix = new int[3][4];

        // // Initialization with values
        // int[][] grid = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // // Accessing elements
        // System.out.println(grid[0][0]);
        // System.out.println(grid[1][2]);

        // // Modifying elements
        // grid[0][0] = 10;

        // // Looping through multidimensional array
        // for (int i = 0; i < grid.length; i++) {
        // for (int j = 0; j < grid[i].length; j++) {
        // System.out.print(grid[i][j] + " ");
        // }
        // System.out.println();
        // }

        // // Foreach with 2D array
        // for (int[] row : grid) {
        // for (int value : row) {
        // System.out.println(value);
        // }
        // }

        /**
         * =========================================================
         * Jagged Arrays (Irregular)
         * =========================================================
         */
        // int[][] jagged = {
        // { 1, 2 },
        // { 3, 4, 5 },
        // { 6, 7, 8, 9 }
        // };
        // // Looping through jagged array
        // for (int i = 0; i < jagged.length; i++) {
        // for (int j = 0; j < jagged[i].length; j++) {
        // System.out.print(jagged[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}

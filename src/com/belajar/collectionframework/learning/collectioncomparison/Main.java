package com.belajar.collectionframework.learning.collectioncomparison;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // ArrayList - Ordered, allows duplicates, fast access by index
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");
        System.out.println(list);

        // HashSet - No Order, no duplicates, fast loockup
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Ignored - no duplicates
        System.out.println("\n" + set);

        // HashMap - Key-value pair, unique keys
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("A", 3);
        System.out.println(map);
    }
}

package com.intern.day5;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        // Insert

        map.put("Nepal", 120);
        map.put("China", 12000);
        map.put("India", 1200);

        System.out.println(map);

        map.put("Nepal", 130); // update
        System.out.println(map);

        // Search

        if (map.containsKey("Nepal")) {
            System.out.println("Map contains Nepal");
        } else {
            System.out.println("Map does not contain Nepal");
        }

        System.out.println(map.get("Nepal"));
        System.out.println(map.get("Nepali")); // null

        // int arr[] = { 1, 2, 3, 4, 5 };

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }


        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

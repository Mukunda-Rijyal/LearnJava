package com.intern.day5.morelessions.part1;

import java.util.HashMap;
import java.util.Map;

public class Q3 {

    void addToMap(HashMap<Integer, String> map, Integer rollno, String name) {
        map.put(rollno, name);
    }

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        Q3 obj = new Q3();
        obj.addToMap(map, 1, "Mukunda");
        obj.addToMap(map, 2, "Birat");
        obj.addToMap(map, 3, "Tilak");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " -> Name: " + entry.getValue());
        }

    }
}

package com.intern.day5.morelessions.part1;
import java.util.Iterator;
import java.util.LinkedList;

public class Q1 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Dragon Fruit");
        list.add("Orange");

        // for each loop
        for (String fruit : list) {
            System.out.println(fruit);
        }

        System.out.println("-------------------");

        // For Loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------");

        // Iteration 
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

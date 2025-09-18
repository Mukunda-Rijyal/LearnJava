package com.intern.day5;

import java.util.*;

public class LiLs {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("A");
        list.addFirst("is");
        System.out.println(list);
        list.addLast("this");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }

}

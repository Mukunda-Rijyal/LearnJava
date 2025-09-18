package com.intern.day5;
import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<Integer>();

        // Insert

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search
        

        set.remove(1);

if(set.contains(1)){
            System.out.println("Set contains 1");
        } else {
            System.out.println("Set does not contain 1");
        }

        System.out.println(set);

        Iterator it = set.iterator();
        // hasNext() and next()
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        

    }
}

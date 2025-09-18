package com.intern.day5.morelessions.part1;

import java.util.HashSet;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();


        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }
        
        System.out.println(set);

        set.add(2);
        System.out.println(set);
    }
}

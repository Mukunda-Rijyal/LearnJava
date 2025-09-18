package com.intern.day5.learninterface;

import java.util.*;
import com.intern.day5.learninterface.Client;

public class User implements Client {


    public void display() {
        System.out.println("Display method");
    }


    public void show() {
        System.out.println("Show method");
    }

        public static void main(String[] args) {
        User u = new User();
        u.display();
        u.show();
    }


}

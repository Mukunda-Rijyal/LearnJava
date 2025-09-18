package com.intern.day5.passingobject;

import java.util.*;

class Student {
    String name;
    int className;

    Student(String name, int className) {
        this.name = name;
        this.className = className;
    }
}

class Details {

    void studentDetails(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Class: " + student.className);
    }
}

public class StudentExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student class: ");
        int className = scanner.nextInt();

        Student student = new Student(name, className);
        Details details = new Details();
        details.studentDetails(student);
    }

}

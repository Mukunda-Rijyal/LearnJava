package com.intern.day5.morelessions.part3;


class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;
    int marks;

    Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 101, 95);
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Marks: " + student.marks);
    }
}

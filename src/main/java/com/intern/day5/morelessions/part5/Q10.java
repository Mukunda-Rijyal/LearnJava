package com.intern.day5.morelessions.part5;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class Q10 {

    static void increaseMarks(Student student) {
        student.marks += 10;
    }

    public static void main(String[] args) {

        Student student = new Student("Alice", 85);
        System.out.println("Before increase:");
        student.display();
        increaseMarks(student);

        System.out.println("After increase:");
        student.display();
    }

}

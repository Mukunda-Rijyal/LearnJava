package com.intern.day6.schoolmanagement;

import java.util.*;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Marks: " + marks);
    }
}

class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully: " + student.name);
    }

    void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.display();
        }
    }

    void updateMarks(int rollNo, int newMarks) {
        for (Student student : students) {
            if (student.rollNo == rollNo) {
                student.marks = newMarks;
                System.out.println("Marks updated for Roll No: " + rollNo);
                return;
            }
        }
        System.out.println("Student with Roll No " + rollNo + " not found.");
    }
}


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        StudentManagement management = new StudentManagement();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.next();

                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();

                    System.out.print("Enter Marks: ");
                    int marks = scanner.nextInt();

                    Student stu = new Student(name, rollNo, marks);
                    management.addStudent(stu);
                    break;
                case 2:
                    management.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll No to update: ");
                    int rNo = scanner.nextInt();

                    System.out.print("Enter new Marks: ");
                    int newMarks = scanner.nextInt();

                    management.updateMarks(rNo, newMarks);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}

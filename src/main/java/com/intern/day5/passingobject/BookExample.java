package com.intern.day5.passingobject;

import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Printer {
    void printBook(Book book) {
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
    }
}

public class BookExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        
        Book book = new Book(title, author);
        Printer printer = new Printer();
        printer.printBook(book);
    }
}

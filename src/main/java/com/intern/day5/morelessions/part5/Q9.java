package com.intern.day5.morelessions.part5;

class Book {
    String title;
    String price;

    Book(String title, String price) {
        this.title = title;
        this.price = price;
    }
}

public class Q9 {

    void printBook(Book book) {
        System.out.println("Title: " + book.title + ", Price: " + book.price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "500rs");
        Book book2 = new Book("To Kill a Mockingbird", "400rs");

        Q9 q9 = new Q9();
        q9.printBook(book1);
        q9.printBook(book2);
    }

}

// Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add
// and remove books from a collection.
package Constructor;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private String title;
    private String author;
    private String ISBN;
    // Parameterized constructor
    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    // Copy constructor
    public Books(Books book) {
        this.title = book.title;
        this.author = book.author;
        this.ISBN = book.ISBN;
    }
    public static void main(String[] args) {
        Books book1 = new Books("Java Programming", "John Doe", "1234567890");
        System.out.println("Title: " + book1.title);
        System.out.println("Author: " + book1.author);
        System.out.println("ISBN: " + book1.ISBN);
        Books book2 = new Books(book1);
        System.out.println("Title: " + book2.title);
        System.out.println("Author: " + book2.author);
        System.out.println("ISBN: " + book2.ISBN);
    }
}

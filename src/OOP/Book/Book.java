package OOP.Book;

import java.util.ArrayList;

// Write a Java program to create a class called "Book" with attributes for title,
// author, and ISBN, and methods to add and remove books from a collection.
public class Book {
    private String title;
    private String author;
    private String isbn;
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle() {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor() {
        this.author = author;
    }
    public String getISBN() {
        return isbn;
    }
    public void setISBN() {
        this.isbn = isbn;
    }
    public static ArrayList<Book> getBookCollection() {
        return bookCollection;
    }
    public static void addBookCollection(Book book) {
        bookCollection.add(book);
    }
    public static void removeBookCollection(Book book) {
        bookCollection.remove(book);
    }
}

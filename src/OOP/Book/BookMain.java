package OOP.Book;

import java.util.ArrayList;

// Write a Java program to create a class called "Book" with attributes for title,
// author, and ISBN, and methods to add and remove books from a collection.
public class BookMain {
    public static void main(String[] args) {
        // Add Book
        Book book1 = new Book("Hong Lau Mong", "Tao Tuyet Can", "TT1");
        Book book2 = new Book("Tam Quoc Chi", "Tran Tho", "LS1");
        Book.addBookCollection(book1);
        Book.addBookCollection(book2);
        Book.addBookCollection(book2);
        Book.addBookCollection(book2);
        ArrayList<Book> bookCollection = Book.getBookCollection();
        System.out.println("List of books :");
        for (Book book:bookCollection) {
            System.out.println("Title: " + book.getTitle() + ", tac gia: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
        // Remove Book
        Book.removeBookCollection(book1);
        System.out.println("List of books after removing :");
        for (Book book:bookCollection) {
            System.out.println("Title: " + book.getTitle() + ", tac gia: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}

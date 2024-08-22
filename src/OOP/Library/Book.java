// Write a Java program to create a class called "Library" with a collection of books and methods to add and
// remove books.
package OOP.Library;
public class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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
}

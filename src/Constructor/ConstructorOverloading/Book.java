// Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default
// constructor and two parameterized constructors:
// One constructor takes title and author as parameters.
// The other constructor takes title, author, and price as parameters.
// Print the values of the variables for each constructor.
package Constructor.ConstructorOverloading;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public static void main(String[] args) {
        // Create a new Book object using the default constructor
        Book book1 = new Book();
        // Print the values of the instance variables for book1
        System.out.println("Book1 Title: " + book1.title);
        System.out.println("Book1 Author: " + book1.author);
        System.out.println("Book1 Price: " + book1.price);

        // Create a new Book object using the parameterized constructor (title, author)
        Book book2 = new Book("Amatka", "Karin Tidbeck");
        // Print the values of the instance variables for book2
        System.out.println("Book2 Title: " + book2.title);
        System.out.println("Book2 Author: " + book2.author);
        System.out.println("Book2 Price: " + book2.price);

        // Create a new Book object using the parameterized constructor (title, author, price)
        Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18.99);
        // Print the values of the instance variables for book3
        System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);
    }

}

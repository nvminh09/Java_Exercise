package OOP.Library;
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            System.out.println("Book not found in library");
        }
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
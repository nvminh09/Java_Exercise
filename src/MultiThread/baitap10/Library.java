package MultiThread.baitap10;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    public Library() {
        books = new ArrayList<Book>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println(">>> Da them sach: " + book.getTitle());
    }
    public synchronized void borrowBook(String bookTitle) {
        for (Book book : books) {
            if (bookTitle.equals(book.getTitle())) {
               if (book.isAvailable()) {
                   book.setAvailable(false);
                   System.out.println("<<< Da cho muon sach: " + book.getTitle());
                   return;
               }
            }
        }
        System.out.println("--- Khong the cho muon sach: " + bookTitle);
    }
    public synchronized void returnBook(String bookTitle) {
        for (Book book : books) {
            if (bookTitle.equals(book.getTitle())) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("<<< Da cho tra sach: " + book.getTitle());
                    return;
                }
            }
        }
    }
}

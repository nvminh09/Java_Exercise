package OOP.Library;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("The last of the Mohican", "James Fenimore Cooper");
        Book book2 = new Book("War and Peace", "Leo Tolstoy");
        Book book3 = new Book("Dream of the red chamber", "Cao Xueqin");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.printBooks();
        library.removeBook(book1);
        library.printBooks();
        library.removeBook(book1);
        library.printBooks();
    }
}
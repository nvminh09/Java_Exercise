// Sử dụng ArrayList để lưu trữ danh sách các cuốn sách trong thư viện. Mỗi cuốn sách được biểu diễn bằng một lớp Book với
// các thuộc tính như title (tên sách), author (tác giả), và available (trạng thái có sẵn hay không). Chương trình bao gồm
// các phương thức sau:
// * addBook(): Cho phép người dùng thêm một cuốn sách mới vào thư viện.
// * borrowBook(): Cho phép người dùng mượn một cuốn sách từ thư viện. Trước khi mượn, phải kiểm tra xem cuốn sách có sẵn hay không.
// Nếu có sẵn, đánh dấu cuốn sách là không có sẵn.
// * returnBook(): Cho phép người dùng trả lại một cuốn sách đã mượn. Đánh dấu cuốn sách là có sẵn.
// * displayBooks(): Hiển thị danh sách các cuốn sách trong thư viện.
package MultiThread.baitap10;

public class Book {
    private String title;
    private String author;
    private boolean available;
    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

}

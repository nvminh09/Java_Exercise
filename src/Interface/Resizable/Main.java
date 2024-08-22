package Interface.Resizable;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 200);
        rectangle.printSize();
        rectangle.resizeWidth(150);
        rectangle.resizeHeight(250);
        rectangle.printSize();
    }
}
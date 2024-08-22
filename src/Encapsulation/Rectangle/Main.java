package Encapsulation.Rectangle;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10.5);
        rectangle.setWidth(5.5);
        double length = rectangle.getLength();
        double width = rectangle.getWidth();
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}
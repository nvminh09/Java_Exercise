package JavaInheritance.Shape;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 10.0);
        double area = rectangle.getArea();
        System.out.println("The area of rectangle is: " + area);
    }
}

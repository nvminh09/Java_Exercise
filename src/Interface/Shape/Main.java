package Interface.Shape;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(1);
        Triangle triangle = new Triangle(4, 5);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Area of triangle: " + triangle.getArea());
    }
}

package OOP.Shape;
public class ShapeMain {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(15, 5);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.area());
        System.out.println("Triangle Perimeter: " + triangle.perimeter());
    }
}
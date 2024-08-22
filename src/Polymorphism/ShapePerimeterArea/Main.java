package Polymorphism.ShapePerimeterArea;
public class Main {
    public static void main(String[] args) {
        // Circle
        double radius = 10;
        Circle circle = new Circle(radius);
        System.out.println("Radius of the Circle: " + radius);
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter() + "\n");
        // Triangle
        double a = 10, b = 2, c = 3;
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Sides of the Triangle are: " + a + ", " + b + ", " + c);
        System.out.println("Area of the Triangle: " + triangle.getArea());
        System.out.println("Perimeter of the Triangle: " + triangle.getPerimeter());
        // Rectangle
        double length = 10, width = 5;
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("\nSides of the Rectangle are: " + length + ", " + width);
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
    }
}
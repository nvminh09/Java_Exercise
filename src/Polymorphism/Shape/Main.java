package Polymorphism.Shape;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("Area of circle: " + circle.calculatedArea());
        Rectangle rectangle = new Rectangle(10, 100);
        System.out.println("Area of rectangle: " + rectangle.calculatedArea());
        Triangle triangle = new Triangle(10, 10);
        System.out.println("Area of triangle: " + triangle.calculatedArea());
    }
}
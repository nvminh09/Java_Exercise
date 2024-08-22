package Polymorphism.ShapeDrawArea;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape triangle = new Triangle(3, 4);
        Shape square = new Square(5);
        drawAndCalculateArea(circle);
        drawAndCalculateArea(triangle);
        drawAndCalculateArea(square);
    }
    public static void drawAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}
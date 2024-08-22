package Polymorphism.ShapeCircleCylinder;
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape cylinder = new Cylinder(5, 20);
        drawShapeAndCalculateArea(circle);
        drawShapeAndCalculateArea(cylinder);
    }
    public static void drawShapeAndCalculateArea(Shape shape) {
        shape.draw();
        double area = shape.calculateArea();
        System.out.println("Area: " + area);
    }
}
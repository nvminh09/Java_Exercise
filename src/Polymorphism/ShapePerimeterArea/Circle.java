package Polymorphism.ShapePerimeterArea;
public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
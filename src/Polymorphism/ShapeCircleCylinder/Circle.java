package Polymorphism.ShapeCircleCylinder;
class Circle extends Shape {
    private double radius;
    protected double getRadius() {
        return radius;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
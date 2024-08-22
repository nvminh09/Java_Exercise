package AbstractClass.ShapeAreaPerimeter;
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}
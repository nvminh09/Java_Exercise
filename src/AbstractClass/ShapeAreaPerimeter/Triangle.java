package AbstractClass.ShapeAreaPerimeter;
public class Triangle extends Shape{
    private double side_a;
    private double side_b;
    private double side_c;
    public Triangle(double side_a, double side_b, double side_c) {
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }
    @Override
    double calculateArea() {
        double p = 0.5 * (side_a + side_b + side_c);
        return Math.sqrt(p * (p - side_a) * (p - side_b) * (p - side_c));
    }
    @Override
    double calculatePerimeter() {
        return side_a + side_b + side_c;
    }
}
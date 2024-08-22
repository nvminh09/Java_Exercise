package Polymorphism.ShapePerimeterArea;
public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalArgumentException("The length of side must be positive numbers.");
            } else {
                if (a + b <= c || a + c <= b || b + c <= a) {
                    System.out.println("The sides " + a + ", " + b + ", and " + c + " do not form a valid triangle.");
                } else {
                    System.out.println("The sides " + a + ", " + b + ", and " + c + " form a valid triangle.");
                    this.a = a;
                    this.b = b;
                    this.c = c;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public double getArea() {
        double p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
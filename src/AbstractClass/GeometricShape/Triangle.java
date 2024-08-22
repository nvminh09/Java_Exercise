package AbstractClass.GeometricShape;
class Triangle extends GeometricShape {
    private double a;
    private double b;
    private double c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double area() {
        double p = perimeter() * 0.5;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }
}
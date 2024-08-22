package AbstractClass.GeometricShape;
class Circle extends GeometricShape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double area() {
        return Math.PI * r * r;
    }
    @Override
    public double perimeter() {
        return Math.PI * 2 * r;
    }
}
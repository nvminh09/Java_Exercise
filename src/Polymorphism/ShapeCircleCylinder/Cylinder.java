package Polymorphism.ShapeCircleCylinder;
class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a cylinder.");
    }
    @Override
    public double calculateArea() {
        double circleArea = super.calculateArea();
        double sideArea = Math.PI * 2 * getRadius() * height;
        return 2 * circleArea + sideArea;
    }
}
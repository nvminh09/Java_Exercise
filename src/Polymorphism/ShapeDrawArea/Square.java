package Polymorphism.ShapeDrawArea;
class Square extends Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public void draw() {
        System.out.println("Draw a square.");
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}
package AbstractClass.ShapeAreaPerimeter;
public class Main {
    public static void main(String[] args) {
        double r = 0.5;
        Circle circle = new Circle(r);
        double a = 30, b = 40, c = 50;
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Radius of the Circle: " + r);
        System.out.println("Area of the Circle: " + circle.calculateArea());
        System.out.println("Perimeter of the Circle: " + circle.calculatePerimeter());
        System.out.println("\nSides of the Triangle are: " + a + ", " + b + ", " + c);
        System.out.println("Area of the Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of the Triangle: " + triangle.calculatePerimeter());
    }
}
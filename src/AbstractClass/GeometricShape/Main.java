package AbstractClass.GeometricShape;
public class Main {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3, 4, 5);
        GeometricShape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Perimeter of circle: " + circle.perimeter());
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Perimeter of Triangle: " + triangle.perimeter());
    }
}
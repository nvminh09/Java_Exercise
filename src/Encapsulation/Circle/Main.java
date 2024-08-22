package Encapsulation.Circle;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10.0);
        double radius = circle.getRadius();
        double perimeter = circle.calculatePerimeter();
        double area = circle.calculateArea();
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Perimeter of Circle: " + perimeter);
        System.out.println("Area of Circle: " + area);
    }
}
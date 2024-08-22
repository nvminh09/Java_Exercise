package OOP.Circle;

// Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.
public class CircleMain {
    public static void main(String[] args) {
        int r = 5;
        Circle circle1 = new Circle(r);
        System.out.println("The radius is: " + r);
        System.out.println("The area is: " + circle1.getArea());
        System.out.println("The circumference is: " + circle1.getCircumference());
        // Reset radius is 1000
        r = 1000;
        circle1.setRadius(r);
        System.out.println("The radius is: " + r);
        System.out.println("The area is: " + circle1.getArea());
        System.out.println("The circumference is: " + circle1.getCircumference());
    }
}
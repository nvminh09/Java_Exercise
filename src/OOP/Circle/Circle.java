package OOP.Circle;

// Write a Java program to create a class called "Circle" with a radius attribute.
// You can access and modify this attribute. Calculate the area and circumference of the circle.
public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}
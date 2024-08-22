// Write a Java program to create a class Shape with methods getArea() and getPerimeter(). Create three subclasses:
// Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() methods in each subclass to calculate and
// return the area and perimeter of the respective shapes.
package Polymorphism.ShapePerimeterArea;
abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
/*
public class Shape {
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
}*/

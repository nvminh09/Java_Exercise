// Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses:
// Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override
// the calculateArea() method to calculate and return the area of each shape.
package Polymorphism.ShapeDrawArea;
abstract class Shape {
    public abstract void draw();
    public abstract double calculateArea();
}
// Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses
// Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override
// the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.
package Polymorphism.ShapeCircleCylinder;
abstract class Shape {
    public abstract void draw();
    public abstract double calculateArea();
}
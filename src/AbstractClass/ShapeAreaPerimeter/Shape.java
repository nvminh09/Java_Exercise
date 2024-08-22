// Write a Java program to create an abstract class Shape with abstract methods calculateArea()
// and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class
// and implement the respective methods to calculate the area and perimeter of each shape.
// In the following program Shape is the abstract base class with two abstract methods:
// calculateArea() and calculatePerimeter(). The Circle and Triangle classes are subclasses of Shape
// and provide their own implementations for abstract methods.
package AbstractClass.ShapeAreaPerimeter;
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}
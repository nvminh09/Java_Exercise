// Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter().
// Create subclasses Triangle and Circle that extend the GeometricShape class and implement the respective methods
// to calculate the area and perimeter of each shape.
package AbstractClass.GeometricShape;
abstract class GeometricShape {
    public abstract double area();
    public abstract double perimeter();
}
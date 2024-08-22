// Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and
// calculateSurfaceArea(). Create subclasses Sphere and Cube that extend the Shape3D class and
// implement the respective methods to calculate the volume and surface area of each shape.
package AbstractClass.Shape3D;
abstract class Shape3D {
    public abstract double calculateVolume();
    public abstract double calculateSurfaceArea();
}
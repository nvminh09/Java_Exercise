// Write a Java program to create a base class Vehicle with methods startEngine() and stopEngine(). Create two
// subclasses Car and Motorcycle. Override the startEngine() and stopEngine() methods in each subclass to start and
// stop the engines differently.
package Polymorphism.VehicleCarMoto;
abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}
// Write a Java program to create a class Vehicle with a method called speedUp(). Create two subclasses Car and Bicycle.
// Override the speedUp() method in each subclass to increase the vehicle's speed differently.
package Polymorphism.Vehicle;
public class Vehicle {
    private int speed;
    public void speedUp() {
         speed += 10;
    }
    public int getSpeed() {
        return speed;
    }
}
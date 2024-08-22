// Write a Java program to create a class called "Vehicle" with attributes for make, model, and year. Create subclasses
// "Car" and "Truck" that add specific attributes like trunk size for cars and payload capacity for trucks.
// Implement a method to display vehicle details in each subclass.
package OOP.Vehicle;
public class Vehicle {
    private String make;
    private String model;
    private int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayDetail() {
        System.out.println("Make: " + make + "\nModel: " + model + "\nYear: " + year);
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

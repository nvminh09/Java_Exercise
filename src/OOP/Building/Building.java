// Write a Java program to create a class called "Building" with attributes for address, number of floors, and total
// area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of
// apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent
// for each subclass.
package OOP.Building;
public class Building {
    private String address;
    private int numberOfFloors;
    private double totalArea;
    public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getNumberOfFloors() {
        return numberOfFloors;
    }
    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public double getTotalArea() {
        return totalArea;
    }
    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }
    // Method to display basic information about the building
    public void displayInfo() {
        System.out.println("Address: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq meters");
    }
}

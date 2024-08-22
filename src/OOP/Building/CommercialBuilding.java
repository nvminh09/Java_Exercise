// Write a Java program to create a class called "Building" with attributes for address, number of floors, and total
// area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of
// apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent
// for each subclass.
package OOP.Building;
class CommercialBuilding extends Building {
    private int officeSpace;
    double rentPerSquareMeter;
    public CommercialBuilding(String address, int numberOfFloors, double totalArea, int officeSpace, double rentPerSquareMeter) {
        super(address, numberOfFloors, totalArea);
        this.officeSpace = officeSpace;
        this.rentPerSquareMeter = rentPerSquareMeter;
    }
    public double calculateTotalRent() {
        return officeSpace * rentPerSquareMeter;
    }
    public int getOfficeSpace() {
        return officeSpace;
    }
    public void setOfficeSpace(int officeSpace) {
        this.officeSpace = officeSpace;
    }
    public double getRentPerSquareMeter() {
        return rentPerSquareMeter;
    }
    public void setRentPerSquareMeter(double rentPerSquareMeter) {
        this.rentPerSquareMeter = rentPerSquareMeter;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Office Space: " + officeSpace + " sq meters");
        System.out.println("Rent per Square Meter: $" + rentPerSquareMeter);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }

}

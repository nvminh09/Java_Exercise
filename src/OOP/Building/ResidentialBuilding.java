// Write a Java program to create a class called "Building" with attributes for address, number of floors, and total
// area. Create subclasses "ResidentialBuilding" and "CommercialBuilding" that add specific attributes like number of
// apartments for residential and office space for commercial buildings. Implement a method to calculate the total rent
// for each subclass.
package OOP.Building;
class ResidentialBuilding extends Building {
    private int numberOfApartments;
    private double rentPerApartment;
    public ResidentialBuilding(String address, int numberOfFloors, double totalArea, int numberOfApartments) {
        super(address, numberOfFloors, totalArea);
        this.numberOfApartments = numberOfApartments;
    }
    public int getNumberOfApartments() {
        return numberOfApartments;
    }
    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }
    public double getRentPerApartment() {
        return rentPerApartment;
    }
    public void setRentPerApartment(double rentPerApartment) {
        this.rentPerApartment = rentPerApartment;
    }
    public double calculateTotalRent() {
        return numberOfApartments * rentPerApartment;
    }
    // Override the displayInfo method to include additional details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Apartments: " + numberOfApartments);
        System.out.println("Rent per Apartment: $" + rentPerApartment);
        System.out.println("Total Rent: $" + calculateTotalRent());
    }
}
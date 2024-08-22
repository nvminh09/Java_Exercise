// Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and
// duration. Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access.
// Implement methods to calculate membership fees and check for special offers based on membership type.
package OOP.GymMembersShip;
class GymMembersShip {
    String memberName;
    String memberShipType;
    int duration;
    public GymMembersShip(String memberName, String memberShipType, int duration) {
        this.memberName = memberName;
        this.memberShipType = memberShipType;
        this.duration = duration;
    }
    public double calculateFees() {
        double baseFee = 50.0; // Base fee per month
        return baseFee * duration;
    }
    public String checkSpecialOffers() {
        if (memberShipType.equalsIgnoreCase("annual")) {
            return "10% discount on annual membership.";
        } else {
            return "No special offers available.";
        }
    }
    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + memberShipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + calculateFees());
        System.out.println("Special Offers: " + checkSpecialOffers());
    }
}

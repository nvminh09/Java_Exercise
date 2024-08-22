package OOP.GymMembersShip;
public class Main {
    public static void main(String[] args) {
        GymMembersShip basic = new GymMembersShip("John Doe", "Basic", 3);
        PremiumMembership premium = new PremiumMembership("Jane Doe", "Premium", 3, true, true);
        System.out.println("Basic Membership Details:");
        basic.displayDetails();
        System.out.println("Basic Membership Fees: $" + basic.calculateFees());
        System.out.println("Premium Membership Details:");
        premium.displayDetails();
        System.out.println("Premium Membership Fees: $" + premium.calculateFees());
    }
}

package OOP.GymMembersShip;

public class PremiumMembership extends GymMembersShip {
    private boolean personalTrainer;
    private boolean spaAccess;
    public PremiumMembership(String name, String memberShipType, int duration, boolean personalTrainer, boolean spaAccess) {
        super(name, memberShipType, duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }
    @Override
    public double calculateFees() {
        double baseFee = super.calculateFees();
        double additionalFee = 0.0;
        // Base fee per month
        if (personalTrainer) {
            baseFee += 30.0; // Additional fee for personal trainer
        }
        if (spaAccess) {
            baseFee += 30.0; // Additional fee for spa access
        }
        return baseFee + additionalFee;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer: " + (personalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }
}

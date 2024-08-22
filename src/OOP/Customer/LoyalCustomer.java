package OOP.Customer;
public class LoyalCustomer extends Customer {
    private double discountRate;
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    public double applyDiscount(double amount) {
        return amount - (amount * discountRate / 100);
    }
    @Override
    public void addPurchase(double amount) {
        super.addPurchase(applyDiscount(amount));
    }
}

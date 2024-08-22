// Create a subclass " WashingMachine" that adds a warranty period attribute and a method to extend the warranty.
package OOP.ElectronicsProduct;
public class WashingMachine extends ElectronicProduct {
    private int warrantyPeriod;
    public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }
    public void extendWarranty(int additionalWarranty) {
        warrantyPeriod += additionalWarranty;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    @Override
    public void applyDiscount(double discountPercentage) {
        super.applyDiscount(discountPercentage);
        System.out.println("Discount applied to Washing Machine: " + getName());
    }
}

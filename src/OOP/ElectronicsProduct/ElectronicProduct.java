// Write a Java program to create a class called "ElectronicsProduct" with attributes for product ID, name, and price.
// Implement methods to apply a discount and calculate the final price. Create a subclass " WashingMachine" that adds
// a warranty period attribute and a method to extend the warranty.
package OOP.ElectronicsProduct;
public class ElectronicProduct {
    private String productID;
    private String name;
    private double price;
    public ElectronicProduct(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }
    public void applyDiscount(double discountPercentage) {
        price = price - (price * discountPercentage / 100);
    }
    public double calculateFinalPrice() {
        return price;
    }
    public String getProductID() {
        return productID;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
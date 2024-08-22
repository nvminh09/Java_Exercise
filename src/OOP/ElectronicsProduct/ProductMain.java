package OOP.ElectronicsProduct;
public class ProductMain {
    public static void main(String[] args) {
        ElectronicProduct product1 = new ElectronicProduct("A1", "Washing Machine", 1000);
        product1.applyDiscount(10);
        System.out.println("Product ID: " + product1.getProductID());
        System.out.println("Product Name: " + product1.getName());
        System.out.println("Final Price: " + product1.calculateFinalPrice());
        System.out.println();

        // Create a WashingMachine object
        WashingMachine washingMachine = new WashingMachine("W456", "Front Load Washing Machine", 800.00, 24);
        // Apply a discount and display the final price
        washingMachine.applyDiscount(10);
        System.out.println("Product ID: " + washingMachine.getProductID());
        System.out.println("Name: " + washingMachine.getName());
        System.out.println("Price after discount: $" + washingMachine.calculateFinalPrice());
        // Display the warranty period
        System.out.println("Warranty period: " + washingMachine.getWarrantyPeriod() + " months");
        // Extend the warranty period and display the new warranty period
        washingMachine.extendWarranty(12);
        System.out.println("Warranty period after extension: " + washingMachine.getWarrantyPeriod() + " months");
    }
}
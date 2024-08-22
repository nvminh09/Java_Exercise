package OOP.Inventory;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> products;
    public Inventory() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void removeProduct(Product product) {
        products.remove(product);
    }
    public void isLowInventory() {
        for (Product product : products) {
            if (product.getQuantity() < 100) {
                System.out.println("Low inventory for " + product.getName());
            }
        }
    }
}

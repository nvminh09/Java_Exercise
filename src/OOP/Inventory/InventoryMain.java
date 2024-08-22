package OOP.Inventory;
public class InventoryMain {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Product product1 = new Product("Apple", 50);
        Product product2 = new Product("Banana", 150);
        Product product3 = new Product("Orange", 20);
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);
        inventory.isLowInventory();
        inventory.removeProduct(product1);
        inventory.isLowInventory();
    }
}

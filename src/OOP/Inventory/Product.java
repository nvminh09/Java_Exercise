// Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove
// products, and to check for low inventory.
package OOP.Inventory;
public class Product{
    private String name;
    private int quantity;
    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

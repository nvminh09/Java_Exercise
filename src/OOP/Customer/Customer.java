// Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history.
// Implement methods to add purchases to the history and calculate total expenditure. Create a subclass "LoyalCustomer"
// that adds a discount rate attribute and a method to apply the discount.
package OOP.Customer;

import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String name;
    private String email;
    private List<Double> purchaseHistory;
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.purchaseHistory = new ArrayList<>();
    }
    public void addPurchase(double purchase) {
        purchaseHistory.add(purchase);
    }
    public double totalExpenditure() {
        double total = 0;
        for (double purchase : purchaseHistory) {
            total += purchase;
        }
        return total;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Double> getPurchaseHistory() {
        return purchaseHistory;
    }
    public void setPurchaseHistory(List<Double> purchaseHistory) {
        this.purchaseHistory = purchaseHistory;
    }
}
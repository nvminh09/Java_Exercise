// Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date.
// Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to
// calculate delivery time based on the address and update the tracking status.
package OOP.CustomerOrder;

import java.time.LocalDate;
import java.util.Date;
public class CustomerOrder {
    private int orderID;
    private String customer;
    private LocalDate orderDate;
    public CustomerOrder(int orderID, String customer, LocalDate orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}
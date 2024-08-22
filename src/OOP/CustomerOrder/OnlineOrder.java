// Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date.
// Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to
// calculate delivery time based on the address and update the tracking status.
package OOP.CustomerOrder;

import java.time.LocalDate;
import java.util.Date;

public class OnlineOrder extends CustomerOrder {
    private String deliveryAddress;
    private String trackingNumber;
    public OnlineOrder(int orderID, String customer, LocalDate orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
    public String getTrackingNumber() {
        return trackingNumber;
    }
    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
    // calculate delivery time based on the address
    public void calculateDeliveryTime() {
        // Assuming delivery time is based on the length of the address string
        int deliveryTime = deliveryAddress.length() / 10;
        System.out.println("Estimated delivery time: " + deliveryTime + " days");
    }
    // Methods update the tracking status
    public void updateTrackingStatus(String status) {
        // Print the updated tracking status
        System.out.println("Tracking Number: " + trackingNumber + " - Status: " + status);
    }
    // Override the displayOrderDetails method to include additional details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
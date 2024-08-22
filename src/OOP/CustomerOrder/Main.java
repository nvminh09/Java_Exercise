// Write a Java program to create a class called "CustomerOrder" with attributes for order ID, customer, and order date.
// Create a subclass "OnlineOrder" that adds attributes for delivery address and tracking number. Implement methods to
// calculate delivery time based on the address and update the tracking status.
package OOP.CustomerOrder;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Main {
    public static void main(String[] args) {
        // Create an instance of the OnlineOrder class
        CustomerOrder order = new CustomerOrder(123, "John Doe", LocalDate.now());
        // Display the order details
        order.displayOrderDetails();
        System.out.println();

        // Create an OnlineOrder object
        OnlineOrder onlineOrder = new OnlineOrder(134, "Kai Biserka", LocalDate.now(), "123 ABC Street, Springfield", "STR455");
        // Display the online order details
        onlineOrder.displayOrderDetails();
        // Calculate and display the delivery time
        onlineOrder.calculateDeliveryTime();
        // Update and display the tracking status
        onlineOrder.updateTrackingStatus("In Transit");
    }
}
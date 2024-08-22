// Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and
// date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number
// for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.
package OOP.Reservation;

import java.time.LocalDate;
public class Reservation {
    private int reservationID;
    private String customerName;
    private LocalDate date;
    public Reservation(int reservationID, String customerName, LocalDate date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
    }
    public int getReservationID() {
        return reservationID;
    }
    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void checkReservationStatus() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
    }
    public void modifyReservationDetails(int reservationID, String customerName, LocalDate date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
    }
}

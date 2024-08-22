// Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and
// date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number
// for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.
package OOP.Reservation;

import java.time.LocalDate;

public class ResortReservation extends Reservation {
    private int roomNumber;
    public ResortReservation(int reservationID, String customerName, LocalDate date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public void checkReservationStatus() {
        super.checkReservationStatus();
        System.out.println("Room Number: " + roomNumber);
    }
    public void modifyReservationDetails(int reservationID, String customerName, LocalDate date, int roomNumber) {
        super.modifyReservationDetails(reservationID, customerName, date);
        this.roomNumber = roomNumber;
    }
}
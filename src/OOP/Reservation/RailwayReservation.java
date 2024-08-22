// Write a Java program to create a class called "Reservation" with attributes for reservation ID, customer name, and
// date. Create subclasses "ResortReservation" and "RailwayReservation" that add specific attributes like room number
// for hotels and seat number for flights. Implement methods to check reservation status and modify reservation details.
package OOP.Reservation;

import java.time.LocalDate;
public class RailwayReservation extends Reservation {
    private int seatNumber;
    public RailwayReservation(int reservationID, String customerName, LocalDate date, int seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
    @Override
    public void checkReservationStatus() {
        super.checkReservationStatus();
        System.out.println("Seat Number: " + seatNumber);
    }
    public void modifyReservationDetails(int reservationID, String customerName, LocalDate date, int seatNumber) {
        super.modifyReservationDetails(reservationID, customerName, date);
        this.seatNumber = seatNumber;
        System.out.println("Reservation details modified successfully!");
    }
}
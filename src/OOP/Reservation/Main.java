package OOP.Reservation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ResortReservation resortReservation = new ResortReservation(1, "John Doe", LocalDate.now(), 101);
        resortReservation.checkReservationStatus();
        System.out.println();
        resortReservation.modifyReservationDetails(1, "Jane Doe", LocalDate.of(2024, 6, 15), 102);
        resortReservation.checkReservationStatus();
        System.out.println();
        RailwayReservation railwayReservation = new RailwayReservation(2, "Alice", LocalDate.of(2024, 6, 15), 1);
        railwayReservation.checkReservationStatus();
        System.out.println();
        railwayReservation.modifyReservationDetails(2, "Bob", LocalDate.of(2024, 6, 20), 23);
        railwayReservation.checkReservationStatus();
    }
}
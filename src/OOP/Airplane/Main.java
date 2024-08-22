package OOP.Airplane;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("AA123", "New York", LocalTime.of(10,00));
        Airplane airplane2 = new Airplane("BB456", "Los Angeles", LocalTime.of(12,00));
        Airplane airplane3 = new Airplane("CC789", "Chicago", LocalTime.of(15,26));
        System.out.println("Flight Status:");
        airplane1.printFlightDetails();
        airplane2.printFlightDetails();
        airplane3.printFlightDetails();
        System.out.println("\nCurrent Flight Status:");
        airplane1.setDelayTime(30);
        airplane2.setDelayTime(15);
        airplane3.setDelayTime(0);
        airplane1.printFlightDetails();
        airplane2.printFlightDetails();
        airplane3.printFlightDetails();
    }
}
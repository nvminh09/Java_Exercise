// Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time
// attributes, and methods to check flight status and delay.
package OOP.Airplane;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Airplane {
    private String flightNumber;
    private String destination;
    private LocalTime departureTime;
    private int delayTime;
    public Airplane(String flightNumber, String destination, LocalTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayTime = 0;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public LocalTime getDepartureTime() {
        return departureTime;
    }
    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }
    public int getDelayTime() {
        return delayTime;
    }
    public void setDelayTime(int delayTime) {
        this.delayTime = delayTime;
        this.departureTime = this.departureTime.plusMinutes(delayTime);
    }
    public void printFlightDetails() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        if (delayTime > 0) {
            System.out.println("Delayed by: " + delayTime + " minutes");
        } else {
            System.out.println("On time");
        }
    }
}
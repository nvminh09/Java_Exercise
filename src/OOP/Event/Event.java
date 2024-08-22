// Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create
// subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and
// performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.
package OOP.Event;

import java.util.Date;

public class Event {
    String eventName;
    Date date;
    String location;
    public Event(String eventName, Date date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }
    public void displayEventDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }
    public boolean checkConflict(Event event) {
        return this.date.equals(event.date) && this.location.equals(event.location);
    }
}
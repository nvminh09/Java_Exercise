// Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create
// subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and
// performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.
package OOP.Event;

import java.util.Date;

public class Seminar extends Event {
    int numberOfSpeakers;
    public Seminar(String eventName, Date date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }
    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}

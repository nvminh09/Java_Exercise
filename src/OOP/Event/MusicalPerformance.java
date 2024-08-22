// Write a Java program to create a class called "Event" with attributes for event name, date, and location. Create
// subclasses "Seminar" and "MusicalPerformance" that add specific attributes like number of speakers for seminars and
// performer list for concerts. Implement methods to display event details and check for conflicts in the event schedule.
package OOP.Event;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class MusicalPerformance extends Event {
    ArrayList performers;
    public MusicalPerformance(String eventName, Date date, String location, ArrayList performers) {
        super(eventName, date, location);
        this.performers = performers;
    }
    public List getPerformers() {
        return performers;
    }
    public void setPerformers(ArrayList performers) {
        this.performers = performers;
    }
    @Override
    public void displayEventDetails() {
        super.displayEventDetails();
        System.out.println("Performers: " + String.join(", ", performers));
    }
}
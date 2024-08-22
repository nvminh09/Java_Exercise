package OOP.Event;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Date date = new Date();
        // Create a seminar
        Seminar seminar = new Seminar("Java Seminar", date, "Online", 2);
        seminar.displayEventDetails();
        // Create a musical performance
        ArrayList performers = new ArrayList<>();
        performers.add("Performer 1");
        performers.add("Performer 2");
        MusicalPerformance musicalPerformance = new MusicalPerformance("Concert", date, "Online", performers);
        musicalPerformance.displayEventDetails();
        // Check for conflict
        System.out.println(seminar.checkConflict(musicalPerformance));
    }
}

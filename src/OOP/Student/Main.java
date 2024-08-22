package OOP.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 10, new ArrayList<String>(Arrays.asList("Math", "History", "English")));
        student1.printInfo();
        student1.addCourse("Science");
        student1.printInfo();
        student1.removeCourse("History");
        student1.printInfo();
    }
}
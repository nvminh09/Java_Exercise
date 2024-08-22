// Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits.
// Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course
// details and check if the course is eligible for a certificate based on duration.
package OOP.Course;
public class Course {
    String courseName;
    String instructor;
    int credits;
    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getInstructor() {
        return instructor;
    }
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }
}

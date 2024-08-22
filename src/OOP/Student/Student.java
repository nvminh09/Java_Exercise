// Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to
// add and remove courses.
package OOP.Student;

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    private ArrayList courses;
    public Student(String name, int grade, ArrayList courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade() {
        this.grade = grade;
    }
    public ArrayList getCourses() {
        return courses;
    }
    public void setCourses() {
        this.courses = courses;
    }
    public void addCourse(String course) {
        courses.add(course);
    }
    public void removeCourse(String course) {
        courses.remove(course);
    }
    public void printCourses(ArrayList courses) {
        System.out.println("List of courses: " + courses);
    }
    public void printInfo() {
        System.out.println("\nName: " + name + ", grade: " + grade);
        printCourses(courses);
    }
}
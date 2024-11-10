// Constructor with Array Initialization
// Write a Java program to create a class called Classroom with instance variables className and students (an array of strings).
// Implement a parameterized constructor that initializes these variables. Print the values of the variables.
package Constructor;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    private static String className;
    private static List<String> students;
    public Classroom(String className, List<String> students) {
        this.className = className;
        this.students = students;
    }
    public static Classroom CreateClassroom() throws IOException {
        Scanner scanner = new Scanner(System.in);
        List<String> students = new ArrayList<>();
        System.out.println("Name of the class:");
        String nameClass = scanner.nextLine(); // Read string
        System.out.println("Number of students:");
        int number = scanner.nextInt(); // Read integer
        scanner.nextLine(); // Consume newline character
        for (int i = 0; i <= number - 1; i++) {
            System.out.println("Student " + i + ":");
            String student = scanner.nextLine(); // Read string
            students.add(student);
        }
        return new Classroom(nameClass, students);
    }
    public static void PrintClassroom() {
        System.out.println("Class name: " + className);
        System.out.println("Students: ");
        for (String student : students) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) throws IOException {
        CreateClassroom();
        PrintClassroom();
    }
}

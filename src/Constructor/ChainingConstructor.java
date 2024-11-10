// Chaining Constructors
// Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
// Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor
// chaining to initialize the variables. Print the values of the variables.
package Constructor;
public class ChainingConstructor {
    private int studentId;
    private String studentName;
    private String grade;
    public ChainingConstructor() {
        this(0, "Unknown", "Unknown");
    }

    public ChainingConstructor(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
    public static void main(String[] args) {
        ChainingConstructor student = new ChainingConstructor();
        System.out.println("Student ID: " + student.studentId);
        System.out.println("Student Name: " + student.studentName);
        System.out.println("Grade: " + student.grade);
        ChainingConstructor student1 = new ChainingConstructor(123, "Minh", "A");
        System.out.println("Student ID: " + student1.studentId);
        System.out.println("Student Name: " + student1.studentName);
        System.out.println("Grade: " + student1.grade);
    }
}

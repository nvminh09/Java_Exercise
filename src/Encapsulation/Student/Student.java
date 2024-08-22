// Write a Java program to create a class called Student with private instance variables student_id, student_name, and
// grades. Provide public getter and setter methods to access and modify the student_id and student_name variables.
// However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.
package Encapsulation.Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String studentName;
    private List<Double> grades;
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public List<Double> getGrades() {
        return grades;
    }
    public void addGrades(Double grade) {
        if (grades == null) {
            grades = new ArrayList<>();
        }
        grades.add(grade);
    }
}
package Encapsulation.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId("0056");
        student.setStudentName("Minh Nguyen");
        student.addGrades(1.0);
        student.addGrades(2.0);
        student.addGrades(3.0);
        String id = student.getStudentId();
        String name = student.getStudentName();
        List<Double> grades = student.getGrades();
        System.out.println("Student's ID: " + id);
        System.out.println("Student's name: " + name);
        System.out.println("Grades of student: " + grades);
    }
}
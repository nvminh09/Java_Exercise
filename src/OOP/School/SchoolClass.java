// Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and
// methods to add and remove students and teachers, and to create classes.
package OOP.School;

import java.util.ArrayList;
public class SchoolClass {
    private String className;
    private Teacher teacher;
    private ArrayList<Student> students;
    public SchoolClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void removeStudent(Student student) {
        students.remove(student);
    }
}
package OOP.Employee;

import java.util.ArrayList;

// Write a Java program to create a class called "OOP.Employee" with a name, job title, and salary attributes,
// and methods to calculate and update salary.
public class Employee {
    private String name;
    private String jobTitle;
    private Integer salary;
    private static ArrayList<Employee> employeesList = new ArrayList<Employee>();
    public Employee(String name, String jobTitle, Integer salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle() {
        this.jobTitle = jobTitle;
    }
    public Integer getSalary() {
        return salary;
    }
    public void setSalary() {
        this.salary = salary;
    }
    public static ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }
    // Method to update salary
    public void updateSalary(int bonus) {
        if (bonus > 0) {
            this.salary += bonus;
        }
    }
    public void showEmployee() {
        System.out.println("Ten nhan vien: " + this.name);
        System.out.println("Chuc vu nhan vien: " + this.jobTitle);
        System.out.println("Muc luong: " + this.salary);
    }
}
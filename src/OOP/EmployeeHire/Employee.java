// Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method
// to calculate years of service.
package OOP.EmployeeHire;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary() {
        this.salary = salary;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate() {
        this.hireDate = hireDate;
    }
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }
    public void printEmployee() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire date: " + hireDate);
        System.out.println("Years of service: " + getYearsOfService());
    }
}
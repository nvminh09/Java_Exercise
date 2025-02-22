// Write a Java program that creates a class hierarchy for employees of a company.
// The base class should be Employee, with subclasses Manager, Developer, and Programmer.
// Each subclass should have properties such as name, address, salary, and job title.
// Implement methods for calculating bonuses, generating performance reports, and managing projects.
package JavaInheritance.HierarchyEmployee;
public class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;
    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public double getSalary() {
        return salary;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double calculateBonus() {
        return 0.0;
    }
    public String generatePerformanceReport() {
        return "No performance report available.";
    }
}
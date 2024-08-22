package OOP.EmployeeHire;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Minh", 1000, LocalDate.parse("2019-01-01"));
        Employee employee2 = new Employee("Van", 1200, LocalDate.parse("2018-01-01"));
        Employee employee3 = new Employee("Hoa", 1500, LocalDate.parse("2017-01-01"));
        employee1.printEmployee();
        employee2.printEmployee();
        employee3.printEmployee();
    }
}
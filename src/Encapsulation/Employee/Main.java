package Encapsulation.Employee;
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployee_id("0056");
        employee.setEmployee_name("Minh Nguyen");
        employee.setEmployee_salary(100000);
        String id = employee.getEmployee_id();
        String name = employee.getEmployee_name();
        String salary = employee.getFormattedSalary();
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
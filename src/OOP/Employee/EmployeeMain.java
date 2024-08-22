package OOP.Employee;

// Write a Java program to create a class called "OOP.Employee" with a name, job title, and salary attributes,
// and methods to calculate and update salary.
public class EmployeeMain {
    public static void main(String[] args) {
        int bonus = 10000000;
        Employee employee1 = new Employee("Nguyen Van A", "Giam doc", 1000);
        Employee employee2 = new Employee("Nguyen Van B", "Pho Giam doc", 900);
        employee1.showEmployee();
        employee2.showEmployee();
        System.out.println("Them bonus cho nhan vien employee2");
        employee2.updateSalary(bonus);
        employee2.showEmployee();
    }
}
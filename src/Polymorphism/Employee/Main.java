package Polymorphism.Employee;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Programmer("Nguyen Van Minh", 1000, 40);
        Employee emp2 = new Manager("Nguyen Minh Ngoc", 1000, 200);
        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() +
                            "\nSalary: " + emp1.calculateSalary());
        System.out.println("Programmer: " + emp2.getName() + "\nRole: " + emp2.getRole() +
                            "\nSalary: " + emp2.calculateSalary());
    }
}
package JavaInheritance.Person;
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Minh", "Nguyen", 001, " Job1");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + " (" + employee1.getEmployeeId() + ")");
        Employee employee2 = new Employee("Nguyen", "Minh", 002, " Job2");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + " (" + employee2.getEmployeeId() + ")");
    }
}
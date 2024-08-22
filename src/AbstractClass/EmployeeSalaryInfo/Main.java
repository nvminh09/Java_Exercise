package AbstractClass.EmployeeSalaryInfo;
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Nguyen Van A", 1000, 100);
        Employee programmer = new Programmer("Nguyen Van B", 900,30, 10);
        manager.displayInfo();
        System.out.println("-----------------------------------------");
        programmer.displayInfo();
    }
}
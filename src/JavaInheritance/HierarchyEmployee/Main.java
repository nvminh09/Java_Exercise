package JavaInheritance.HierarchyEmployee;

public class Main {
    public static void main(String[] args) {
        // Set information
        Manager manager = new Manager("Nguyen A", "Street A", 10000, "Manager", 2);
        Developer developer = new Developer("Nguyen B", "Street B", 8000, "Dev", "Java");
        Programmer programmer = new Programmer("Nguyen C", "Street C", 6000, "Code", "C#");
        // Print Bonus
        System.out.println("Manager's Bonus: " + manager.calculateBonus());
        System.out.println("Developer's Bonus: " + developer.calculateBonus());
        System.out.println("Programmer's Bonus: " + programmer.calculateBonus());
        // Print Performance
        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(programmer.generatePerformanceReport());
        // Print the working
        manager.managerProject();
        developer.writeCode();
        programmer.debugCode();
    }
}
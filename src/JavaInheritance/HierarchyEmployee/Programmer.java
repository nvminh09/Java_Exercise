package JavaInheritance.HierarchyEmployee;
public class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String jobTitle, String programLanguage) {
        super(name, address, salary, "Programmer", programLanguage);
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.12;
    }
    @Override
    public String generatePerformanceReport() {
        return "Performance report for Programmer " + getName() + " : Excellent.";
    }
    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code in " + getProgramLanguage());
    }
}

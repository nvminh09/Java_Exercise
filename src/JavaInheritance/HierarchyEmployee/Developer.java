package JavaInheritance.HierarchyEmployee;

public class Developer extends Employee {
    private String programLanguage;
    public Developer(String name, String address, double salary, String jobTitle, String programLanguage) {
        super(name, address, salary, jobTitle);
        this.programLanguage = programLanguage;
    }
    public String getProgramLanguage() {
        return programLanguage;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.1;
    }
    @Override
    public String generatePerformanceReport() {
        return "Performance report for Developer " + getName() + " : Good.";
    }
    public void writeCode() {
        System.out.println("Developer " + getName() + " is writing code in " + programLanguage);
    }
}

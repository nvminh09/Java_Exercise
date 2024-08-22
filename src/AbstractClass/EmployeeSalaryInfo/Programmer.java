package AbstractClass.EmployeeSalaryInfo;
public class Programmer extends Employee {
    private int overHours;
    private double hourlyRate;
    public Programmer(String name, double baseSalary, int overHours, double hourlyRate) {
        super(name, baseSalary);
        this.overHours = overHours;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + (overHours * hourlyRate);
    }
    @Override
    public void displayInfo() {
        System.out.println("Programmer name: " + name);
        System.out.println("Base salary: " + baseSalary);
        System.out.println("Overtime hours: " + overHours);
        System.out.println("Hourly rate: " + hourlyRate);
        System.out.println("Total salary: " + calculateSalary());
    }
}
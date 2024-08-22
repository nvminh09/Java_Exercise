package Polymorphism.Employee;
class Programmer extends Employee {
    private double baseSalary;
    private double overTime;
    public Programmer(String name, double baseSalary, double overTime) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overTime = overTime;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + overTime;
    }
}
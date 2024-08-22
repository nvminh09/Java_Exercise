package Polymorphism.Employee;
class Manager extends Employee {
    private double baseSalary;
    private double bonus;
    public Manager(String name, double baseSalary, double bonus) {
        super(name, "Manager");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
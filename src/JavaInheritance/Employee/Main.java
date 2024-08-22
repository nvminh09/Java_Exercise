package JavaInheritance.Employee;
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(4000);
        HRManager mgr = new HRManager(4000);
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());
        mgr.work();
        System.out.println("Manage salary: " + mgr.getSalary());
        mgr.addEmployee();
    }
}

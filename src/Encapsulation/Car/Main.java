package Encapsulation.Car;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCompanyName("Toyota");
        car.setModelName("Fortuner");
        car.setYear(2010);
        // Mileage is not set using the setter method
        String company = car.getCompanyName();
        String model = car.getModelName();
        int year = car.getYear();
        int mileage = car.getMileage();
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);

    }
}
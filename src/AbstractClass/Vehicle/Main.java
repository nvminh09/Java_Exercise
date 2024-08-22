package AbstractClass.Vehicle;
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motor = new Motorcycle();
        car.startEngine();
        car.stopEngine();
        motor.stopEngine();
        motor.startEngine();
    }
}
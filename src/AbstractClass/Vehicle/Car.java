package AbstractClass.Vehicle;
class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car: starting the engine.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Car: stopping the engine.");
    }
}
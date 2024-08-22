package AbstractClass.Vehicle;
class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle: starting the engine.");
    }
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle: stopping the engine.");
    }
}
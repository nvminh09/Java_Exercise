package Polymorphism.Vehicle;
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Bicycle speed increased by 5 units.");
    }
}
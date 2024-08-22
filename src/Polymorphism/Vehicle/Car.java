package Polymorphism.Vehicle;
class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("\nCar speed increased by 22 unit.");
    }
}
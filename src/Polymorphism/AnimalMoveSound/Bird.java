package Polymorphism.AnimalMoveSound;
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("THe bird flies.");
    }
    @Override
    public void makeSound() {
        System.out.println("THe bird chirps.");
    }
}
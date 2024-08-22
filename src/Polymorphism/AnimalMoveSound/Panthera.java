package Polymorphism.AnimalMoveSound;
class Panthera extends Animal {
    @Override
    public void move() {
        System.out.println("Panthera runs.");
    }
    @Override
    public void makeSound() {
        System.out.println("Panthera roars.");
    }
}
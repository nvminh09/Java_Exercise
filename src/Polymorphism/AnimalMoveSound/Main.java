package Polymorphism.AnimalMoveSound;
public class Main {
    public static void performAction(Animal animal) {
        animal.move();
        animal.makeSound();
    }
    public static void main(String[] args) {
        Animal bird = new Bird();
        Animal panthera = new Panthera();
        performAction(bird);
        performAction(panthera);
    }
}
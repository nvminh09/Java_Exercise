package Polymorphism.Animal;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();
        Cat cat = new Cat();
        animal.Sound();
        bird.Sound();
        cat.Sound();
    }
}
package Polymorphism.AnimalEatSound;
public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal tiger = new Tiger();
        Animal panther = new Panther();
        lion.eat();
        lion.sound();
        tiger.eat();
        tiger.sound();
        panther.eat();
        panther.sound();
    }
}

package Polymorphism.AnimalEatSound;
class Panther extends Animal {
    @Override
    public void eat() {
        System.out.println("Panther eats meat and small mammals.");
    }
    @Override
    public void sound() {
        System.out.println("Panther purrs and sometimes hisses.");
    }
}
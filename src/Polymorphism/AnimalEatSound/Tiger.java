package Polymorphism.AnimalEatSound;
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and fish.");
    }
    @Override
    public void sound() {
        System.out.println("Tiger growls.");
    }
}
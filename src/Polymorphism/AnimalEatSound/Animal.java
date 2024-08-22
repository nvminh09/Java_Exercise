// Write a Java program to create a base class Animal with methods eat() and sound(). Create three subclasses: Lion,
// Tiger, and Panther. Override the eat() method in each subclass to describe what each animal eats. In addition,
// override the sound() method to make a specific sound for each animal.
package Polymorphism.AnimalEatSound;
class Animal {
    public void eat() {
        System.out.println("Animal eats.");
    }
    public void sound() {
        System.out.println("Animal make a sound.");
    }
}
// This exercise shows how inheritance works in Java programming language.
// Inheritance allows you to create new classes based on existing classes, inheriting their attributes and behaviors.
// In this case, the 'Cat' class is a more specific implementation of the 'Animal' class, adding quarrel behavior.
//----------------------------------------------------------------------------------------------------------------------
// Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark.
package JavaInheritance.AnimalSound;
public class Animal {
    public void makeSound() {
        System.out.println("The animal make a sound.");
    }
}
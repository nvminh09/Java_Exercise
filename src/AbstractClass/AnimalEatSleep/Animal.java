// Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
// Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and
// sleep() methods differently based on their specific behavior.
//
// In this program, the Animal class is an abstract class that defines the abstract methods eat() and sleep().
// The Lion, Tiger, and Deer classes extend the Animal class and provide their own implementations for the eat() and
// sleep() methods based on their specific behavior. The Main class demonstrates the usage of these classes by
// creating objects of each subclass and invoking the eat() and sleep() methods accordingly.
package AbstractClass.AnimalEatSleep;
abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}
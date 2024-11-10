// Constructor for Singleton Pattern
// Write a Java program to create a class called Singleton that ensures only one instance of the class can be created.
// Implement a private constructor and a public static method to get the single instance of the class. Print a message
// indicating the creation of the instance.
package Constructor;
public class Singleton {
    private static Singleton instance;
    private Singleton() {
        System.out.println("Instance created.");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("Instance already exists.");
        }
        return instance;
    }
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Both instances are different.");
        }
    }
}

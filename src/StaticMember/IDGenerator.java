// Static Method with Static Variable
// Write a Java program to create a class called "IDGenerator" with a static variable 'nextID' and a static method "generateID()"
// that returns the next ID and increments 'nextID'. Demonstrate the usage of generateID in the main method.
package StaticMember;
public class IDGenerator {
    static int nextID = 1;
    public static int generateID() {
        return nextID++;
    }
    public static void main(String[] args) {
        System.out.println("First ID: " + generateID());
        System.out.println("Second ID: " + generateID());
        System.out.println("Third ID: " + generateID());
    }
}

// Static Block
// Write a Java program to create a class called "Initializer" with a static block that initializes a static variable 'initialValue'
// to 1000. Print the value of 'initialValue' before and after creating an instance of "Initializer".
package StaticMember;
public class Block {
    static int initialValue;
    static {
        initialValue = 1000;
        System.out.println("Static block: initialValue initialize to  " + initialValue);
    }
    public static void main(String[] args) {
        System.out.println("BEFORE creating an instance of Initializer: " + initialValue);
        Block b = new Block();
        System.out.println("AFTER creating an instance of Initializer: " + initialValue);
    }

}

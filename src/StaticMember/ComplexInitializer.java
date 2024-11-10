// Static Block for Complex Initialization
// Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z)
// using complex logic. Print the values of these variables in the main method.
package StaticMember;
public class ComplexInitializer {
    static int x;
    static int y;
    static int z;
    static {
        x = 10;
        y = 20;
        z = compute(x, y);
    }
    private static int compute(int a, int b) {
        return a*100 + b*100;
    }
    public static void main(String[] args) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
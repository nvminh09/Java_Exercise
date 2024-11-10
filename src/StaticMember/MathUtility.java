// Static Methods:
// Write a Java program to create a class called "MathUtility" with a static method add that takes two integers and returns
// their sum. Demonstrate the usage of this static method in the main method without creating an instance of "MathUtility".
package StaticMember;
public class MathUtility {
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 5 and 7 is: " + add(5, 7));
    }
}

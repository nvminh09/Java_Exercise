// Write a Java program to create a method that takes an integer as a parameter
// and throws an exception if the number is odd.
package ExceptionHandling;
public class CheckOdd {
    public static void main(String[] args) {
        int n = 18;
        tryNumber(n);
        n = 7;
        tryNumber(n);
    }
    public static void tryNumber(int n) {
        try {
            checkOddNumber(n);
            System.out.println(n + " is an even number.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkOddNumber(int num) {
        if (num % 2 != 0) {
            throw new IllegalArgumentException(num + " is an odd number.");
        }
    }
}
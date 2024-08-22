// Write a Java program that throws an exception and catch it using a try-catch block.
package ExceptionHandling;
public class Divide {
    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide the given number by zero!");
        }
        return dividend / divisor;
    }
    public static void main(String[] args) {
        try {
            int result = divideNumbers(9, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


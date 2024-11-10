// Static Final Variables
// Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create
// a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.
package StaticMember;
public class Constants {
    public static final double PI = 3.14159;
    public static double calculateArea(double radius) {
        return PI * radius * radius;
    }
    public static void main(String[] args) {
        System.out.println("Area of a circle with radius 5: " + calculateArea(5));
    }
}
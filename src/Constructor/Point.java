// Overloading Constructors with Different Data Types
// Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
// - One constructor takes int parameters.
// - Another constructor takes double parameters.
// - Print the values of the variables for each constructor.
package Constructor;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(double x, double y) {
        this.x = (int) x; // Convert double to int
        this.y = (int) y; // Convert double to int
    }
    public void printPoint() {
        System.out.println("x: " + x + ", y: " + y);
    }
    public static void main(String[] args) {
        Point point1 = new Point(10, 20);
        point1.printPoint();
        Point point2 = new Point(10.5, 20.5);
        point2.printPoint();
    }

}

package OOP.Rectangle;

// Write a Java program to create a class called "OOP.Rectangle" with width and height attributes.
// Calculate the area and perimeter of the rectangle.
public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7, 12);

        System.out.println("The area of the rectangle width = " + rectangle.getWidth() + ", " +
                "height = " + rectangle.getHeight() + " is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle width = " + rectangle.getWidth() + ", " +
                "height = " + rectangle.getHeight() + " is " + rectangle.getPerimeter());

        rectangle.setWidth(100);
        rectangle.setHeight(1000);

        System.out.println("The area of the rectangle width = " + rectangle.getWidth() + ", " +
                "height = " + rectangle.getHeight() + " is " + rectangle.getArea());
        System.out.println("The perimeter of the rectangle width = " + rectangle.getWidth() + ", " +
                "height = " + rectangle.getHeight() + " is " + rectangle.getPerimeter());
    }
}

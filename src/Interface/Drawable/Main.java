package Interface.Drawable;
public class Main {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
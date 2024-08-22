package AbstractClass.Shape2D;
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        rectangle.draw();
        rectangle.resize();
        circle.draw();
        circle.resize();
    }
}

package AbstractClass.Shape2D;
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle: draw a rectangle.");
    }
    @Override
    public void resize() {
        System.out.println("Rectangle: resize a rectangle");
    }
}
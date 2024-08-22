package AbstractClass.Shape2D;
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle: draw a circle.");
    }
    @Override
    public void resize() {
        System.out.println("Circle: resize a circle.");
    }
}

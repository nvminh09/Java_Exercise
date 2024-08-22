package AbstractClass.Shape3D;
class Cube extends Shape3D {
    private double sideLength;
    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
    @Override
    public double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
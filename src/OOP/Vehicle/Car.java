package OOP.Vehicle;
class Car extends Vehicle {
    private double trunkSize;
    public Car(String make, String model, int year, double trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }
    public double getTrunkSize() {
        return trunkSize;
    }
    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be greater than 0.");
        }
    }
    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet.");
    }

}

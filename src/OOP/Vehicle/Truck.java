package OOP.Vehicle;
class Truck extends Vehicle {
    private double payloadCapacity;
    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }
    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons.");
    }
    public double getPayloadCapacity() {
        return payloadCapacity;
    }
    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be greater than 0.");
        }
    }
}
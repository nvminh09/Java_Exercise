package OOP.Pet;
public class Bird extends Pet {
    private int wingSpan;
    public Bird(String name, int age, int wingSpan) {
        super(name, "Bird", age);
        this.wingSpan = wingSpan;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Wing Span: " + wingSpan);
    }
}

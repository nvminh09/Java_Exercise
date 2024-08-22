package AbstractClass.AnimalEatSleep;
public class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eat meat.");
    }
    @Override
    public void sleep() {
        System.out.println("Lion sleep on grassland.");
    }
}
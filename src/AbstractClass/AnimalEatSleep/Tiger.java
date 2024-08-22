package AbstractClass.AnimalEatSleep;
public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");
    }
    @Override
    public void sleep() {
        System.out.println("Tiger sleep in a hidden spot.");
    }
}
package AbstractClass.AnimalEatSleep;
public class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer grazes on grass and leaves.");
    }
    @Override
    public void sleep() {
        System.out.println("Deer sleep on open fields.");
    }
}
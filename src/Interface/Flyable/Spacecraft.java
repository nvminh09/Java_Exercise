package Interface.Flyable;
public class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying.");
    }
}
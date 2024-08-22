package Interface.Flyable;
public class Main {
    public static void main(String[] args) {
        Flyable[] flyableObject = {new Spacecraft(), new Airplane(), new Helicopter()};
        for (Flyable obj : flyableObject) {
            obj.fly_obj();
        }
    }
}
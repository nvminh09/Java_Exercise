package AbstractClass.AnimalEatSleep;
public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.sleep();
        System.out.println();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
        Deer deer = new Deer();
        deer.eat();
        deer.sleep();
    }
}
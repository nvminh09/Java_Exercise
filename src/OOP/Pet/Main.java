package OOP.Pet;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 2, "Ball");
        Bird bird = new Bird("Tweety", 1, 10);
        System.out.println("Dog Details:");
        dog.displayDetails();
        System.out.println("Dog Age in Human Years: " + dog.calculateHumanAge());
        System.out.println("Bird Details:");
        bird.displayDetails();
        System.out.println("Bird Age in Human Years: " + bird.calculateHumanAge());
    }
}

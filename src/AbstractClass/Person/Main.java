package AbstractClass.Person;
public class Main {
    public static void main(String[] args) {
        Person athlete = new Athlete();
        Person lazyperson = new LazyPerson();
        athlete.eat();
        athlete.exercise();
        lazyperson.eat();
        lazyperson.exercise();
    }
}
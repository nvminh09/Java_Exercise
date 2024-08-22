package OOP.Person;

// Write a Java program to create a class called "OOP.Person" with a name and age attribute.
// Create two instances of the "OOP.Person" class, set their attributes using the constructor,
// and print their name and age.
public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Minh", 39);
        Person person2 = new Person("Ngoc", 11);
        System.out.println("Ten: " + person1.getName() + ". Tuoi: " + person1.getAge());
        System.out.println("Ten: " + person2.getName() + "\nTuoi: " + person2.getAge());
    }
}

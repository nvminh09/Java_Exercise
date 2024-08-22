package OOP.Dog;

// Write a Java program to create a class called "OOP.Dog" with a name and breed attribute.
// Create two instances of the "OOP.Dog" class, set their attributes using the constructor
// and modify the attributes using the setter methods and print the updated values.
public class DogMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ki", "Berge");
        Dog dog2 = new Dog("Toto", "Japan");
        System.out.println("Name of dog 1 is " + dog1.getName() + " and breed is " + dog1.getBreed());
        System.out.println("Name of dog 2 is " + dog2.getName() + " and breed is " + dog2.getBreed());

        System.out.println("\nSet the new Breed of dog1 and new Name of dog2:");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");
    }
}

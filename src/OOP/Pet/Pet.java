// Write a Java program to create a class called "Pet" with attributes for name, species, and age. Create subclasses
// "Dog" and "Bird" that add specific attributes like favorite toy for dogs and wing span for birds. Implement methods
// to display pet details and calculate the pet's age in human years.
package OOP.Pet;
class Pet {
    private String name;
    private String species;
    private int age;
    public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }
    public int calculateHumanAge() {
        if (species.equals("Dog")) {
            return age * 7;
        } else {
            // Assuming bird's age in human years is the same as actual age
            return age;
        }
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age);
    }
}
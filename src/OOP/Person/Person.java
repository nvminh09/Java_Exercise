// Write a Java program to create a class called "OOP.Person" with a name and age attribute.
// Create two instances of the "OOP.Person" class, set their attributes using the constructor,
// and print their name and age.
package OOP.Person;
public class Person {
    private String name;
    private Integer age;

    // Constructor
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
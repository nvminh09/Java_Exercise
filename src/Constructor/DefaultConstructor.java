// Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor
// that initializes the name to "Unknown" and the age to 0. Print the values of the variables.
package Constructor;
public class DefaultConstructor {
    private String name;
    private int age;
    // Default constructor
//    public DefaultConstructor() {
//        this.name = "Unknown";
//        this.age = 0;
//    }
    public DefaultConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
//    public static void main(String[] args) {
//        DefaultConstructor cat = new DefaultConstructor();
//        System.out.println("Name: " + cat.getName());
//        System.out.println("Age: " + cat.getAge());
//    }
    public static void main(String[] args) {
        DefaultConstructor cat = new DefaultConstructor("Minh", 39);
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
}
}

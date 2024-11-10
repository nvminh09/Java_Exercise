// Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor
// that takes name and color as parameters and initializes the instance variables. Print the values of the variables.
package Constructor;
public class ParameterConstructor {
    private String name;
    private String color;
    public ParameterConstructor(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
        ParameterConstructor dog = new ParameterConstructor("Buddy", "Brown");
        System.out.println("Name:" + dog.getName());
        System.out.println("Color:" + dog.getColor());
    }
}

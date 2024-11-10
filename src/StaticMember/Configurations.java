// Static Block for Initialization
// Write a Java program to create a class called Configuration with a static block that initializes a static variable 'configValue'
// from a configuration file (simulated with a default value). Print the value of 'configValue' in the main method.
package StaticMember;
public class Configurations {
    static int configValue;
    static {
        configValue = 1000;
        System.out.println("Static block: configValue initialize to  " + configValue);
    }
    public static void main(String[] args) {
        System.out.println("configValue: " + configValue);
    }
}

// Write a Java program that tests a singleton class, ensuring it behaves as expected in a multi-threaded environment.
package UnitTest.Singleton;
public class Singleton {
    private static volatile Singleton instance;
    private Singleton() {
        // Private constructor to prevent instantiation
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
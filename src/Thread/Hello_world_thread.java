// Write a Java program to create a basic Java thread that prints "Hello, World!" when executed.
package Thread;
public class Hello_world_thread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, World!");
    }
    public static void main(String[] args) {
        Hello_world_thread thread = new Hello_world_thread();
        thread.start();
    }
}
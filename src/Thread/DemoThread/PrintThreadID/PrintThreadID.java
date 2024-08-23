// Write a Java program to print the thread Id of a thread
// The Java code defines two classes: PrintThreadID and MyThread. The PrintThreadID class is the main class, and the MyThread class
// implements the Runnable interface to define the behavior of a custom thread.
//
// In the PrintThreadID class, the main method creates a new thread t by passing an instance of MyThread to its constructor.
// The code then starts the thread's execution using the start() method.
//
// The MyThread class defines the run() method, which is executed when the t thread starts running. Inside the run() method, the code
// retrieves the ID of the current thread using Thread.currentThread().getId() and then prints it to the console.
//
// When you run this code, it will print the ID of the thread executing the run() method, which is the ID of the newly created t thread.
// The thread ID is a unique identifier assigned by the JVM to each thread. The ID is a positive long integer, and the value can vary
// based on the platform and the JVM implementation.

package Thread.DemoThread.PrintThreadID;
public class PrintThreadID {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        t.start();
    }
}
class MyThread implements Runnable {
    public void run() {
        System.out.println("Thread ID : " + Thread.currentThread().getId());
    }
}

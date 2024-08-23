// Write a Java program to create a thread by implementing a Runnable interface
// The Java code demonstrates how to create a thread by implementing the Runnable interface. The CreateThread_Implementing class
// implements the Runnable interface, and its run() method defines the behavior of the thread. Here's a step-by-step explanation of what
// happens when you run this code:
//
//  An instance of CreateThread_Implementing named m is created.
//  A new Thread named thrd is created, passing the m instance to its constructor. This associates the CreateThread_Implementing instance
//  with the thread.
// The start() method is called on the thrd object, which starts the execution of the thread. When start() is called, it internally invokes
// the run() method of the Runnable object (m in this case).
// The run() method of the CreateThread_Implementing class executes, and it prints "Thread Executed" to the console.
// Meanwhile, in the main method, after starting the thread, the code proceeds to the next statement and prints "Outside Thread" to the console.
// Since the thread runs concurrently with the main thread, the order of the output is not guaranteed. It may vary based on the thread scheduler
// and system behavior. However, you will always see both "Thread Executed" and "Outside Thread" printed to the console.
package Thread.DemoThread.RunnableInterface;
public class CreateThread_Implementing implements Runnable {
    public static void main(String[] args) {
        CreateThread_Implementing m = new CreateThread_Implementing();
        Thread thrd = new Thread(m);
        thrd.start();
        System.out.println("Outside thread.");
    }
    @Override
    public void run() {
        System.out.println("Thread executed.");
    }
}
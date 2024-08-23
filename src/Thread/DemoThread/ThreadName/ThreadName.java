// Write a Java program to set and print thread name
// The Java code demonstrates how to create a thread and retrieve its name using the Thread.getName() method. The code is straightforward
// and prints the name of the thread after starting it. Here's what happens when you run this code:
//  A new Thread object named thrd is created with the name "Thread" passed to its constructor. This associates the name "Thread" with the thread.
//  The start() method is called on the thrd object, which starts the execution of the thread.
//  Immediately after starting the thread, the code retrieves the name of the thread using the getName() method and assigns it to the variable
//  threadName.
//  The name of the thread is then printed to the console using System.out.println().
// Since the thread runs concurrently with the main thread, the order of the output is not guaranteed. It may vary based on the thread scheduler
// and system behavior. However, you will always see the thread name being printed to the console.
package Thread.DemoThread.ThreadName;
public class ThreadName {
    public static void main(String[] args) {
        String threadName;
        Thread thrd = new Thread("Thread");
        thrd.start();
        threadName = thrd.getName();
        System.out.println("Thread name: " + threadName);
    }
}

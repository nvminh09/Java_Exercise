// Write a Java program to destroy a thread group
// The code you've provided demonstrates how to create a thread group, add a thread to it, and then destroy the thread group.
// However, there are a few things to note and some corrections to be made:
// 1. Thread Group Usage: Thread groups are not commonly used in modern Java programming due to their limited usefulness and complexities.
// They were originally designed to manage threads as a group, but they lack certain features and have been largely replaced by more
// robust concurrency mechanisms provided by the java.util.concurrent package.
// 2. destroy() Method: The destroy() method used on a ThreadGroup is considered deprecated and its use is discouraged. This method forcibly
// destroys all the threads and subgroups within the group, which can lead to unpredictable behavior and resource leaks.
// 3. Runnable Sleep: In the MyRunnable class, you have a Thread.sleep(5000) call, which means the thread will sleep for 5 seconds
// (5000 milliseconds) after starting. This is just a simulation of some work being done by the thread.
// 4. Thread.sleep() Handling: You should be careful with the handling of InterruptedException when calling Thread.sleep(). It's generally a
// good practice to handle the interruption gracefully, which could involve cleaning up resources and/or preserving the interrupted status.
package Thread.DemoThread.DestroyThread;
public class DestroyThread {
    public static void main(String[] args) {
        // Create a new thread group
        ThreadGroup myThreadGroup = new ThreadGroup("MyThreadGroup");
        // Create a new thread and add it to the thread group
        Thread myThread = new Thread(myThreadGroup, new MyRunnable());
        myThread.start();
        // Sleep for some time to allow the thread to execute
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Destroy the thread group and all its subgroups
        myThreadGroup.destroy();
        System.out.println("Thread group destroyed.");
    }
    static class MyRunnable implements Runnable {
        public void run() {
            try {
                // Simulate some work
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
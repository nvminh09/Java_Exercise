// Write a Java program to get information of the current executing thread
// The code you've provided is correct and demonstrates how to obtain various information about the current executing thread in Java.
// It uses methods provided by the Thread class to access information such as the thread's name, ID, priority, state, daemon status,
// liveness, and interruption status. Your code is a useful example of how to retrieve and display thread information in a Java program.
// Here's a breakdown of what the code does:
// 1. Thread.currentThread(): This method returns a reference to the currently executing thread.
// 2. getName(): This method returns the name of the thread.
// 3. getId(): This method returns the unique identifier of the thread.
// 4. getPriority(): This method returns the priority of the thread. Thread priorities range from 1 (lowest) to 10 (highest).
// 5. getState(): This method returns the current state of the thread. The possible states include NEW, RUNNABLE, BLOCKED, WAITING,
// TIMED_WAITING, and TERMINATED.
// 6. isDaemon(): This method returns true if the thread is a daemon thread, which means it runs in the background and does not prevent
// the JVM from exiting even if it's still running.
// 7. isAlive(): This method returns true if the thread is still alive (i.e., not terminated).
// 8. isInterrupted(): This method returns true if the thread has been interrupted (i.e., if its interrupted status flag is set).
package Thread.DemoThread.CurrentThreadInfo;
public class CurrentThreadInfo {
    public static void main(String[] args) {
        // Get the current executing thread
        Thread currentThread = Thread.currentThread();
        // Display information about the current thread
        System.out.println("Name: " + currentThread.getName());
        System.out.println("ID: " + currentThread.getId());
        System.out.println("Priority: " + currentThread.getPriority());
        System.out.println("State: " + currentThread.getState());
        System.out.println("Daemon: " + currentThread.isDaemon());
        System.out.println("Alive: " + currentThread.isAlive());
        System.out.println("Interrupted: " + currentThread.isInterrupted());
    }
}

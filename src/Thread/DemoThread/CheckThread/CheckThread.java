// Write a Java program to check thread is alive or not
// The Java code defines two classes: CheckThread and MyThread. The CheckThread class is the main class, and the MyThread class implements
// the Runnable interface to define the behavior of the thread.
//
// In the CheckThread class, the main method creates a new thread t by passing an instance of MyThread to its constructor. The code then
// prints the status of the thread using the isAlive() method before and after starting the thread.
//
// The isAlive() method is used to check if a thread is still alive or has terminated. It returns true if the thread has been started and
// has not yet completed (i.e., is still running) and false otherwise. Here's what happens step by step when you run this code:
//
// A new thread t is created but not started yet.
// The code prints "Thread isAlive : false" because the thread has not been started, and thus it is not yet alive.
// The t.start() method is called to start the thread's execution.
// The code immediately prints "Thread isAlive : true" because t has been started, but the run() method's execution might not have completed yet.
// The run() method of the MyThread class prints "Thread is running." to the console.
// The run() method completes, and the thread's execution finishes.
// The code again prints "Thread isAlive : false" because the thread has completed its execution and is no longer alive.
package Thread.DemoThread.CheckThread;
public class CheckThread {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread());
        System.out.println("Thread is alive: " + t.isAlive());
        t.start();
        System.out.println("Thread is alive: " + t.isAlive());
    }

}
class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread is running.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

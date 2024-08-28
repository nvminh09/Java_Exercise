// Write a Java program to set thread priority
// The Java code demonstrates how to set the priority of a thread using the Thread.setPriority() method and then retrieve and print
// the priority using the Thread.getPriority() method. In the SetPriority class:
// 1. A new thread object named thread is created and associated with an instance of the MyRunnable class.
// 2. The priority of the thread is set to the maximum priority using thread.setPriority(Thread.MAX_PRIORITY).
// 3. The thread is started using the start() method.
// 4. Inside the run() method of the MyRunnable class, the priority of the current thread (which is the thread object) is retrieved using
// Thread.currentThread().getPriority().
// 5. The retrieved priority is printed to the console using System.out.println().
// Thread priorities range from Thread.MIN_PRIORITY (1) to Thread.MAX_PRIORITY (10). The code sets the priority of the new thread to the
// maximum value of 10.
package Thread.DemoThread.ThreadPriority;

public class SetPriority { // SetPriority class
    public static void main(String[] args)
    {
        Thread thread = new Thread(new MyRunnable());
        thread.setPriority(Thread.MAX_PRIORITY); // Setting thread priority to maximum
        thread.start();
    }
    static class MyRunnable implements Runnable
    {
        @Override
        public void run()
        {
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        }
    }
    /*public static void main(String[] args) {
        Thread thread = Thread.currentThread(); // Get the reference to the current thread
        System.out.println("Current Thread Priority: " + thread.getPriority()); // Print the current thread's priority
        thread.setPriority(Thread.MAX_PRIORITY); // Set the priority of the current thread to the maximum priority
        System.out.println("New Thread Priority: " + thread.getPriority()); // Print the new priority of the current thread
    }*/
}

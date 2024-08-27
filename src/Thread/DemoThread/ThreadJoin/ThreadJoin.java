// Write a Java program to demonstrate the Thread.join() method
// The Java code demonstrates how to use the join() method to wait for multiple threads to complete their execution before proceeding
// with the main thread. In the ThreadJoin class, the main method creates three threads: thread1, thread2, and thread3, each associated
// with an instance of the MyRunnable class. Then, it starts the execution of all three threads using the start() method.
//
// The MyRunnable class implements the Runnable interface and defines the behavior of the threads. Inside the run() method, each thread
// prints a message indicating that it is running, then sleeps for 2 seconds using Thread.sleep(2000), and finally prints a completion
// message before exiting.
//
// After starting the threads, the main thread uses the join() method to wait for each thread to complete before proceeding. The join()
// method blocks the calling thread (in this case, the main thread) until the target thread (the thread on which join() is called) completes
// its execution. Therefore, the main thread will wait for thread1, thread2, and thread3 to complete in order, as they are joined in that
// order. Once all three threads have completed their execution, the main thread prints "All threads have Completed" and the program terminates.
package Thread.DemoThread.ThreadJoin;
public class ThreadJoin {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join(); // Wait for thread1 to complete
            System.out.println(thread1.getName() + " has completed.");
            thread2.join(); // Wait for thread2 to complete
            System.out.println(thread2.getName() + " has completed.");
            thread3.join(); // Wait for thread3 to complete
            System.out.println(thread3.getName() + " has completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All threads have Completed.");
    }
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has completed.");
        }
    }
}

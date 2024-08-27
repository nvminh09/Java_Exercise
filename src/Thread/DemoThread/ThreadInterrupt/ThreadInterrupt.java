// Write a Java program to interrupt the execution of a thread
// The Java code demonstrates how to use the Thread.interrupt() method to interrupt a thread and handle the InterruptedException
// to safely stop the thread's execution. In the ThreadInterrupt class, the main method creates a MyThread object named myThread and
// starts it. Then, the main thread sleeps for 3 seconds using Thread.sleep(3000). After the sleep period, the main thread calls
// myThread.interrupt() to interrupt the myThread thread.
//
// Inside the MyThread class, the run() method defines the behavior of the custom thread. It runs in a while loop and checks the
// isInterrupted() method of the current thread (the MyThread thread) in each iteration. If the thread has not been interrupted,
// it prints "Thread is running..." and then sleeps for 1 second using Thread.sleep(1000).
//
// If the InterruptedException is thrown while the thread is sleeping, it means the thread was interrupted externally. In this case,
// the catch block is executed, and the InterruptedException is handled by calling Thread.currentThread().interrupt() to restore the
// interrupted status. The message "Thread was Interrupted" is then printed to the console.
//
// After handling the InterruptedException, the thread continues the loop until it is interrupted again. When the thread is interrupted
// (either externally or from within its run() method), the loop condition !Thread.currentThread().isInterrupted() becomes false, and
// the thread stops executing the loop. It then prints "Thread Stopped" and exits the run() method.
package Thread.DemoThread.ThreadInterrupt;
public class ThreadInterrupt {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
    static class MyThread extends Thread {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    System.out.println("Thread was Interrupted");
                }
                System.out.println("Thread Stopped");
            }
        }
    }
}

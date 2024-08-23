package Thread.DemoThread.ThreadStop;
// Write a Java program to stop a thread
// The Java code demonstrates how to manually stop a thread using the stopThread() method. However, just like the suspend() and resume()
// methods, the stop() method used in this code is also deprecated in Java, and it's not recommended for modern applications. The stop()
// method forcibly terminates the thread, which can lead to potential data corruption and other issues.
//
// Instead of using stop(), a safer and more graceful way to stop a thread is to use cooperative cancellation. This involves setting a
// flag to indicate that the thread should stop its execution, and then letting the thread exit its run loop based on that flag. Here's
// a brief explanation of how the code works:
//
// The MyThread class extends Thread.
// In the run() method, there is a while loop that runs as long as !Thread.currentThread().isInterrupted() returns true. This condition allows
// the thread to continue its execution as long as it has not been interrupted.
// Inside the while loop, the thread prints "Thread is running..." every 1 second (Thread.sleep(1000)).
// If the thread is interrupted while sleeping (if InterruptedException occurs), it calls Thread.currentThread().interrupt() to restore the
// interrupted status.
// The main method creates a MyThread object named myThread and starts it.
// The main thread then sleeps for 3 seconds (Thread.sleep(3000)).
// After sleeping, the main thread calls myThread.stopThread() to stop the myThread thread by interrupting it.
public class ThreadStop
{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(3000); // Sleep for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.stopThread(); // Stop the thread
    }
    static class MyThread extends Thread
    {
        public void run()
        {
            while (!Thread.currentThread().isInterrupted())
            {
                System.out.println("Thread is running...");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                }
            }
            System.out.println("Thread stopped.");
        }
        public void stopThread()
        {
            interrupt();
        }
    }
}

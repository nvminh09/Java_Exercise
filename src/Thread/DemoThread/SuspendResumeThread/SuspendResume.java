package Thread.DemoThread.SuspendResumeThread;

// Write a Java program to suspend and resume a thread
// The Java code demonstrates how to use the suspendThread() and resumeThread() methods to manually suspend and resume a thread's execution.
// However, it's important to note that these methods are deprecated in Java because they can lead to potential thread deadlocks and other
// synchronization issues. They are not recommended for modern applications.
//
// Instead of using suspend() and resume(), a more appropriate approach would be to use modern thread synchronization mechanisms such as
// wait() and notify() or higher-level concurrency utilities provided by Java, like the java.util.concurrent package. Here's a brief
// explanation of how the code works:
//
// The MyThread class extends Thread and has a boolean field suspended to indicate whether the thread is suspended or not. This field is
// declared volatile to ensure visibility and proper synchronization between threads.
// In the run() method, there is an infinite loop that prints "Thread is running" every 1 second (Thread.sleep(1000)). When the thread is
// suspended (suspended == true) , it enters a nested loop where it repeatedly calls Thread.yield(). This effectively suspends the execution
// of the thread until suspended becomes false.
// In the main method, a MyThread object named myThread is created and started.
// After sleeping for 1 second, the main thread calls myThread.suspendThread() to suspend the myThread thread.
// The main thread then sleeps for another 1 second and finally resumes the myThread thread by calling myThread.resumeThread().
// As mentioned earlier, using suspend() and resume() methods is discouraged in modern Java programming. Instead, consider using safer and
// more reliable thread synchronization mechanisms provided by the Java platform. For example, you can use wait() and notify() or explore
// higher-level abstractions like the java.util.concurrent package that offer thread-safe constructs. These mechanisms provide better control
// over thread synchronization and help avoid potential pitfalls associated with direct thread suspension.
public class SuspendResume
{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        try {
            Thread.sleep(1000); // Sleep for 1 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.suspendThread(); // Suspend the thread
        try {
            Thread.sleep(1000); // Sleep for 1 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.resumeThread(); // Resume the thread
    }
    static class MyThread extends Thread
    {
        private volatile boolean suspended;
        public void run()
        {
            while (true)
            {
                System.out.println("Thread is running");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                while (suspended)
                {
                    Thread.yield();
                }
            }
        }

        public void suspendThread()
        {
            suspended = true;
        }

        public void resumeThread()
        {
            suspended = false;
        }
    }
}

package Thread.DemoThread.ThreadGroupExample;

// Write a Java program to create a group of a thread
// The Java code demonstrates how to use the ThreadGroup class to group threads together and manage them as a single entity.
// The code creates a thread group named "MyThreadGroup" and assigns two threads, thread1 and thread2, to this thread group.
// It then starts both threads and performs operations on the thread group. In the ThreadGroupExample class:
//
// A new thread group named "MyThreadGroup" is created using the constructor new ThreadGroup("MyThreadGroup").
// Two threads, thread1 and thread2, are created and associated with the "MyThreadGroup" thread group using new Thread(threadGroup,
// new MyRunnable(), "Thread 1") and new Thread(threadGroup, new MyRunnable(), "Thread 2").
// Both thread1 and thread2 are started using the start() method.
// The code then prints the number of active threads in the thread group using threadGroup.activeCount().
// It also prints the names of the threads currently in the thread group using the enumerate(Thread[] tarray) method.
// The enumerate(Thread[] tarray) method copies the threads in the thread group into the provided array tarray. It returns the number of
// threads copied. The array threads is created with the size of the active thread count in the thread group using threadGroup.activeCount().
// The loop then iterates over the threads array and prints the name of each thread.
public class ThreadGroupExample
{
    public static void main(String[] args)
    {
        ThreadGroup threadGroup = new ThreadGroup("MyThreadGroup");

        Thread thread1 = new Thread(threadGroup, new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(threadGroup, new MyRunnable(), "Thread 2");

        thread1.start();
        thread2.start();

        // Print active thread count in the thread group
        System.out.println("Active Threads in Thread Group : " + threadGroup.activeCount());

        // Print details of threads in the thread group
        System.out.println("Threads in Thread Group :");
        Thread[] threads = new Thread[threadGroup.activeCount()];
        threadGroup.enumerate(threads);
        for (Thread thread : threads)
        {
            System.out.println(thread.getName());
        }
    }

    static class MyRunnable implements Runnable
    {
        public void run()
        {
            System.out.println(Thread.currentThread().getName() + " is Running.");
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " has Completed.");
        }
    }
}

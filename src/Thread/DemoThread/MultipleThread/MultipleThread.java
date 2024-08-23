package Thread.DemoThread.MultipleThread;

// Write a Java program to create multiple threads
// The Java code defines two classes: MultipleThread and MyThread. The MultipleThread class is the main class, and the MyThread class
// implements the Runnable interface to define the behavior of the threads.
//
// In the MultipleThread class, the main method creates three threads t1, t2, and t3, each associated with an instance of the MyThread
// class. Then, it starts the execution of all three threads using the start() method.
//
// The MyThread class defines the run() method, which is executed when the threads start running. Inside the run() method, a loop runs
// five times, and in each iteration, it prints a message indicating that the thread with the specified ID is running.
//
// Since multiple threads are running concurrently, the order of execution and the interleaving of their outputs are not guaranteed.
// The thread IDs are unique identifiers assigned by the JVM to each thread. The output will show different thread IDs for each thread,
// and the messages may appear in different orders for each run.
public class MultipleThread
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());
        Thread t3 = new Thread(new MyThread());

        t1.start();
        t2.start();
        t3.start();
    }
}
class MyThread implements Runnable
{
    public void run()
    {
        int i = 0;
        for (i = 1; i <= 5; i++)
        {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
    }
}
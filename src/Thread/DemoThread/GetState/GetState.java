// Write a Java program to get the state of the currently executing thread
// The Java code defines two classes: GetState and MyThread. The GetState class is the main class, and the MyThread class implements
// the Runnable interface to define the behavior of threads.
//
// In the GetState class, the main method creates two threads (t1 and t2) by passing instances of MyThread to their constructors.
// Then, the start() method is called on both threads to start their execution.
//
// The MyThread class implements the Runnable interface, and its run() method is where the actual thread behavior is defined. Inside the run()
// method, the code attempts to retrieve the state of the current thread using Thread.currentThread().getState(). It then prints the state of
// the thread to the console.
//
// The Thread.State enum represents the possible states of a thread, which include:
//
// NEW: The thread has been created but not yet started.
// RUNNABLE: The thread is currently executing in the JVM.
// BLOCKED: The thread is blocked and waiting for a monitor lock.
// WAITING: The thread is waiting indefinitely for another thread to perform a particular action.
// TIMED_WAITING: The thread is waiting for another thread to perform a particular action, but with a maximum waiting time specified.
// TERMINATED: The thread has finished its execution and terminated.
// Keep in mind that when you run the program, the output may vary depending on the thread scheduler and the system's behavior, as the order of execution between t1 and t2 is not guaranteed. Additionally, since the threads are short-lived and execute quickly, they might not be in certain states (e.g., BLOCKED, WAITING, or TIMED_WAITING) during the time you attempt to retrieve their states, and you might mostly see them in the RUNNABLE state.
package Thread.DemoThread.GetState;
public class GetState
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.start();
        t2.start();
    }
}
class MyThread implements Runnable
{
    public void run()
    {
        try
        {
            Thread.State thrdState = Thread.currentThread().getState();
            System.out.println("Thread State : " + thrdState);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


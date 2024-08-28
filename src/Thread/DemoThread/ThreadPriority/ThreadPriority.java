package Thread.DemoThread.ThreadPriority;

// Write a Java program to get thread priority
// The provided Java code is correct and will display the priority of the current thread, which is the main thread in this case.
// Let's walk through the code:
// 1. The main method is the entry point of the program.
// 2. Thread.currentThread() retrieves a reference to the currently executing thread, which is the main thread in this context.
// 3. getPriority() is called on the current thread to obtain its priority level.
// The priority value is then printed to the console using System.out.println(). As mentioned earlier, by default, the priority of the
// main thread is set to the priority of the thread that created it. In most cases, the default priority for all threads is
// Thread.NORM_PRIORITY, which has a value of 5.
public class ThreadPriority
{
    public static void main(String[] args)
    {
        Thread thread = Thread.currentThread();
        int priority = thread.getPriority();
        System.out.println("Current Thread Priority: " + priority);
    }
}
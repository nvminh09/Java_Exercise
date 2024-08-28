// Write a Java program to count active threads of a thread group
// The Java code demonstrates how to obtain the number of active threads within the current thread's thread group using the
// activeCount() method. In the ActiveGroup class:
// 1. The main method is the entry point of the program.
// 2. Thread.currentThread().getThreadGroup() retrieves the thread group associated with the currently executing thread (main thread in this case).
// 3. activeCount() is called on the obtained thread group to get the count of active threads in that group.
// 4. The count of active threads is then printed to the console using System.out.println().
// The output will vary based on the number of active threads within the current thread's thread group at the moment the activeCount()
// method is called. Please note that thread counts can change rapidly in a multithreaded environment, so the exact number of active
// threads can differ between runs.
package Thread.DemoThread.ActiveGroup;
public class ActiveGroup
{
    public static void main(String[] args)
    {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        int activeThreads = threadGroup.activeCount();
        System.out.println("Active threads in the thread group: " + threadGroup.activeCount());
    }
}
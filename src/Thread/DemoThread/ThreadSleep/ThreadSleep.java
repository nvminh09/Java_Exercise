// Write a Java program to sleep a thread
// The Java code demonstrates the use of the Thread.sleep() method to pause the execution of the current thread for a specified duration.
// In the ThreadSleep class, the main method prints "Before Sleep" to the console. Then, it tries to sleep the main thread for 3 seconds
// using Thread.sleep(3000).
//
// The Thread.sleep() method throws an InterruptedException when the current thread is interrupted while sleeping. In this case, the catch
// block will print the stack trace of the InterruptedException, but since the interruption is not explicitly handled in this code,
// the main thread will continue its execution after the catch block. After the sleep period, the code resumes its execution, and "After Sleep"
// is printed to the console.
package Thread.DemoThread.ThreadSleep;
public class ThreadSleep {
    public static void main(String[] args) {
        System.out.println("Before Sleep.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After Sleep.");
    }
}

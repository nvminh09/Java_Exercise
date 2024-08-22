// Write a Java program to suspend a thread

// The Java code defines two classes: SuspendThread and MyThread. The SuspendThread class is the main class, and the MyThread class
// extends Thread to define the behavior of a custom thread.
//
// In the SuspendThread class, the main method creates a new MyThread object named thread and starts it using the start() method.
// The main thread then sleeps for 2 seconds (Thread.sleep(2000)) to allow the MyThread to run for a short time.
//
// After the 2 seconds sleep, the main thread calls thread.suspend() to suspend the execution of the MyThread. The suspend() method
// is a deprecated method in Java that was used to suspend a thread's execution. Note that using suspend() is not recommended because
// it can lead to various problems, such as potential thread deadlocks. This method has been deprecated in favor of better thread
// synchronization mechanisms.
//
// Once the MyThread is suspended, the code prints "Thread Suspended for 2 Seconds" and then sleeps for another 2 seconds (Thread.sleep(2000)).
// After 2 seconds, the main thread resumes the MyThread's execution by calling thread.resume(). Similarly, the resume() method is also
// deprecated for the same reasons as suspend(). It is safer to use other thread synchronization methods like wait() and notify().
//
// In the MyThread class, the run() method defines the behavior of the custom thread. It simply prints the count from 1 to 10 and sleeps
// for 500 milliseconds between each count. Keep in mind that using suspend() and resume() is not recommended due to their potential
// to cause thread deadlocks and other synchronization issues. It is better to use modern synchronization mechanisms like wait() and
// notify() to control thread execution and communication safely.

package Thread.DemoThread.SuspendThread;
public class SuspendThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            Thread.sleep(2000);
            thread.suspend();
            System.out.println("Thread suspend for 2 seconds.");
            Thread.sleep(2000);
            thread.resume();
            System.out.println("Thread resumed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

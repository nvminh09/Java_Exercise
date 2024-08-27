// Write a Java program to set a thread name using the setName() method
// The Java code demonstrates how to set the name of a thread using the setName() method and how to retrieve the name of the current
// thread using Thread.currentThread().getName().
//
// In the ThreadName class, the main method creates a MyThread object named myThread. Then, it sets the name of the thread to "MyThread"
// using the setName() method. Finally, it starts the myThread thread's execution using the start() method.
//
// Inside the MyThread class, the run() method defines the behavior of the custom thread. It simply prints the name of the current thread
// to the console using Thread.currentThread().getName().
package Thread.DemoThread.ThreadName2;

public class ThreadName {
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.setName("MyThread");
        myThread.start();
    }

    static class MyThread extends Thread
    {
        public void run()
        {
            System.out.println("Thread Name : " + Thread.currentThread().getName());
        }
    }
}

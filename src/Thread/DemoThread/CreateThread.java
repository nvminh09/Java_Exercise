// Write a Java program to create a thread by extending the Thread class
// This Java code creates a simple thread by extending the Thread class and overriding its run method. When the start() method
// is called on the CreateThread object, it will execute the run method in a separate thread of execution. Here's a step-by-step
// explanation of the code:
// A class named CreateThread is defined, which extends the Thread class. This means that the CreateThread class is now a subclass
// of Thread, and it can use the functionalities provided by the Thread class.
// The main method is the entry point of the program. It is the method that gets executed when the program starts.
// Inside the main method:
// An instance of CreateThread named thrd is created.
// The start() method is called on the thrd object. This is how we start the thread execution.
// After calling start(), a new thread is created and executes the run() method concurrently.
// The run() method is overridden from the Thread class, and it will be executed in the new thread. The run() method simply prints
// "Thread Executed" to the console.
// After calling start(), the System.out.println("Outside the Thread"); statement will be executed immediately after, as it's in
// the same thread as the main method. The output of this statement will be printed in the original thread.
package Thread.DemoThread;
public class CreateThread extends Thread {
    public static void main(String[] args) {
        CreateThread thrd = new CreateThread();
        thrd.start();
        System.out.println("Outside the Thread.");
    }
    public void run() {
        System.out.println("Thread Executed.");
    }
}

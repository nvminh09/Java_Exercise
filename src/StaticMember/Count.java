// Static Variables:
// Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that
// increments count every time an object is created. Print the value of count after creating several objects.
package StaticMember;
public class Count {
    private static int count = 0;
    public Count() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public static void main(String[] args) {
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();
        Count c4 = new Count();
        Count c5 = new Count();
        System.out.println("Number of objects created: " + getCount());
    }
}

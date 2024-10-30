// Write a Java program to create a generic method that takes a list of any type and a target element. It returns the
// index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found
package GenericMethod;

import java.util.Arrays;
import java.util.List;

public class FindElement {
    public static <T> int findElement(List<T> list, T target) {
        for (T element : list) {
            if (element.equals(target)) {
                return list.indexOf(element);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        List < Integer > arrInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Index of target element 5: " + findElement(arrInteger, 5));
        System.out.println("Index of target element 10: " + findElement(arrInteger, 10));
        List < String > arrString = Arrays.asList("Red", "Green", "Blue", "Orange", "White");
        System.out.println("Index of target element Orange: " + findElement(arrString, "Orange"));
        System.out.println("Index of target element Oranges: " + findElement(arrString , "Oranges"));
    }
}

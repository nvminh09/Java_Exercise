// Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the
// elements in reverse order.

package GenericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static <T> List<T> reverseList(List<T> list) {
        List <T> reverseList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            reverseList.add(list.get(list.size() - 1 - i));
        }
        return reverseList;
    }
    public static void main(String[] args) {
        List<Integer> arrInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> arrIntegerReverse = reverseList(arrInteger);
        for (Integer element : arrIntegerReverse) {
            System.out.print(element + ", ");
        }
        System.out.println();
        List<String> arrString = Arrays.asList("Red", "Green", "Blue", "Orange", "White");
        List<String> arrStringReverse = reverseList(arrString);
        for (String element : arrStringReverse) {
            System.out.print(element + ", ");
        }
    }
}

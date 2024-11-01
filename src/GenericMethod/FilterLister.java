// Write a Java program to create a generic method that takes a list of any type and a predicate. It returns an array list
// containing only elements that satisfy the predicate.
package GenericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterLister {
    public static <T>List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> result = new java.util.ArrayList<>();
        for (T element : list) {
            // If the element satisfies the predicate, add it to the result list
            if (predicate.test(element)) {
                result.add(element);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Orange", "White");
        List<String> longColors = filter(colors, s -> s.length() > 4);
        System.out.println(longColors);
    }
}

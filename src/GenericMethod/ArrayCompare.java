// Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same
// elements in the same order.

package GenericMethod;

public class ArrayCompare {
    // <T> is a generic type that can be any type of data
    public static <T> boolean compareArray(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 23, 5};
        String[] arr3 = {"a", "b", "c", "d"};
        String[] arr4 = {"a", "b", "c", "d"};
        System.out.println(compareArray(arr1, arr2));
        System.out.println(compareArray(arr3, arr4));
    }

}
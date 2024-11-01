// Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
package GenericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumListNumber {
//    public static <T extends Number> void sumListNumber(T[] arr) {
//        double sumEven = 0;
//        double sumOdd = 0;
//        for (int i = 0; i < arr.length; i ++) {
//            if (arr[i].doubleValue() % 1 == 0 && arr[i].doubleValue() % 2 == 0) {
//                sumEven += arr[i].doubleValue();
//            } else {
//                sumOdd += arr[i].doubleValue();
//            }
//        }
//        System.out.println("Sum of even numbers: " + sumEven);
//        System.out.println("Sum of odd numbers: " + sumOdd);
//    }

    public static <T extends Number> void sumListNumber(List<T> arrNumbers) {
        double sumEven = 0;
        double sumOdd = 0;
        for (T number : arrNumbers) {
            if ( number.doubleValue() % 2 == 0) {
                sumEven += number.doubleValue();
            } else {
                sumOdd += number.doubleValue();
            }
        }
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
    public static void main(String[] args) {
        List < Integer > arr1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List < Double > arr2 = Arrays.asList(2.0, 1.5, 4.5, 2.5, 1.5);
        sumListNumber(arr1);
        sumListNumber(arr2);
    }
}

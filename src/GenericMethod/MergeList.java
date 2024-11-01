// Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list.
// This method alternates the elements of each list.
package GenericMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeList {
    public static <T> List<T> mergeList(List<T> list1, List<T> list2) {
        List listMerge = new ArrayList<>(list1);
        for(int i = 0; i < list2.size(); i++) {
            listMerge.add(list2.get(i));
        }
        return listMerge;
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> listMerge = mergeList(list1, list2);
        for (int i = 0; i < listMerge.size(); i++) {
            System.out.print(listMerge.get(i) + ", ");
        }
        System.out.println();
        List<String> listA = Arrays.asList("orange", "blue", "white", "black", "green");
        List<String> listB = Arrays.asList("ORANGE", "BLUE", "WHITE", "BLACK", "GREEN");
        List<String> listMerge2 = mergeList(listA, listB);
        for (int i = 0; i < listMerge.size(); i++) {
            System.out.print(listMerge2.get(i) + ", ");
        }
    }
}

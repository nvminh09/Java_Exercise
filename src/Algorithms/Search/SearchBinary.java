// Write a Java program to find a specified element in a given array of elements using Binary Search.
package Algorithms.Search;
public class SearchBinary {
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 7, 8, 11};
        int search_num = 111;
        int index = binarySearch(nums, search_num);
        if (index == -1) {
            System.out.println(search_num + " is not in the array");
        } else {
            System.out.println(search_num + " is at index " + index);
        }
    }
}

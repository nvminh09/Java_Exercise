package Interface.SortQuickMerge;
public class Main {
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {
                9,
                5,
                2,
                8,
                0,
                3,
                1,
                6
        };
        Sortable quickSort = new QuickSort();
        quickSort.sort(arr);
        System.out.println("Quick Sort (Descending Order): ");
        printArray(arr);
        int[] arr2 = {
                9,
                5,
                2,
                8,
                0,
                3,
                1,
                6
        };
        Sortable mergeSort = new MergeSort();
        mergeSort.sort(arr2);
        System.out.println("Merge Sort (Descending Order): ");
        printArray(arr2);
    }
}
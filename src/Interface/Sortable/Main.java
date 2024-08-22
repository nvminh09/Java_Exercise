package Interface.Sortable;
public class Main {
    private static void printArray(int[] arr) {
        for(int num : arr) {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr = {
                4,
                2,
                0,
                3,
                1,
                6,
                8
        };
        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Bubble Sort: ");
        printArray(arr);
        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Selection Sort: ");
        printArray(arr);
    }
}
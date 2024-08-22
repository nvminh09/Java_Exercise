package Interface.SortQuickMerge;
class MergeSort implements Sortable {
    private void merge(int[] array, int low, int mid, int high) {
        int leftSize = mid - low + 1;
        int rightSize = high - mid;
        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = array[low + i];
        }
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = array[mid + 1 + i];
        }
        int i = 0, j = 0, k = low;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] >= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }
}
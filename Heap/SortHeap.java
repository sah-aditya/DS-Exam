package Heap;

public class SortHeap {

    /**
     * Heapify the array.
     *
     * @param arr the input array.
     * @param n   the size of the array.
     * @param i   the index to start heapifying from.
     */
    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i ;
        int right = 2 * i + 1;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    /**
     * Sort the array using heap sort.
     *
     * @param arr the input array.
     * @param n   the size of the array.
     */
    public static void heapSort(int arr[], int n) {
        // Build a max heap
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    /**
     * Swap two elements in the array.
     *
     * @param arr the input array.
     * @param i   the index of the first element.
     * @param j   the index of the second element.
     */
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {0, 40, 50, 10, 20, 60, 30};
        int n = arr.length;

        heapSort(arr, n);

        // Print the sorted array
        for (int i = 1; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
package Sorting;

public class BubbleSort {
    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            boolean swapped = false;
            for (int j = 0; j <= arr.length - i - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // If no swaps occurred, the array is already sorted
            }
        }
    }

    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {13, 9, 5, 65, 95, 55, 21};
        sort(arr);
        display(arr);
    }
}
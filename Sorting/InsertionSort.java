package Sorting;

public class InsertionSort {
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {13, 9, 5, 65, 95, 55, 21};
        int n = arr.length;
        sort(arr, n);
        display(arr);
    }

    static void sort(int arr[], int n) {
        for (int i = 1; i < n; i++) { // Start from the second element
            int temp = arr[i]; // Element to be inserted
            int j = i - 1;

            // Shift elements to the right until the correct position is found
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the element in its correct position
            arr[j + 1] = temp;
        }
    }
}

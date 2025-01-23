package Sorting;

public class SelectionSort { static void display(int arr[]) {
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
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j] < arr[min]) min=j;
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;
    }
}}

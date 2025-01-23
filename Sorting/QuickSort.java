package Sorting;

public class QuickSort {static void display(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}

public static void main(String args[]) {
    int[] arr = {13, 9, 5, 65, 95, 55, 21};
    int n = arr.length;
    quickSort(arr, 0,n-1);
    display(arr);
}
static void swap(int arr[], int i, int j){
    int temp= arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

static void quickSort(int arr[], int start, int end){
    if(start<end){
        int pi= partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
        
    }
}

static int partition(int arr[],int start, int end){
    int pivot=arr[end];
    int pindex=start;
    
    for (int i=start;i<end;i++){
        if(arr[i]<pivot){
            
            
            swap(arr,i,pindex);
            pindex++;
       }}
       swap(arr,pindex,end);
       return pindex;
        
    }
    
}

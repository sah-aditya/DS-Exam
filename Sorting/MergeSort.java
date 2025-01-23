package Sorting;

public class MergeSort {
    static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]) {
        int[] arr = {13, 9, 5, 65, 95, 55, 21};
        int n = arr.length;
        mergeSort(arr, 0,n-1);
        display(arr);
    }
   

    
    

        
    
    public static void mergeSort(int arr[],int start, int end){
        if(start<end){
        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);}}
    
        
        
    public static void merge(int arr[], int start, int mid, int end){
        int merged[]=new int[end-start+1];
        int index1=start;
        int index2= mid+1;
        int x=0;
        
        while(index1<=mid && index2<=end){
            if(arr[index1]<=arr[index2]){
                merged[x++]=arr[index1++];
                
            }
            else{ merged[x++]=arr[index2++];
            }
            
            
        }
         while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        
        while(index2<=end){
            merged[x++]=arr[index2++];
        }
        
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }    
        
    }

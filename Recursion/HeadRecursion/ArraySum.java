package Recursion.HeadRecursion;

public class ArraySum {

    public static int sum(int[]arr, int index){
        if(index==arr.length){ //Base case
            return 0;}
        else { //Recursive case
            int partialSum = sum(arr, index+1);
            return arr[index] + partialSum;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sum(arr, 0));
    }
}

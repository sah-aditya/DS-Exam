public class LinearSearch {

    public int search(int[] arr, int k){
        for (int i=0;i<=arr.length-1;i++){
            if (arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 10;
        int result = ls.search(arr, k);
        if (result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+result);
        }
    }
    
}

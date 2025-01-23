
class BinarySearch {
    public static int search(int[]arr, int key){
       
        int beg=0;
        int end =arr.length-1;
        
        while(beg<=end){
        int mid=(int)Math.floor((end+beg)/2);
        
        if (arr[mid]==key) {return mid;}
        
        else if (arr[mid]<key){
            beg=mid+1;
        }
        
        else if (arr[mid]>key){
            end=mid-1;
        }
    }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]= {2,5,8,9,12,15,17,19,20,25,21};
        int key=5;
        int index=search(arr,key);
        if(index==-1) System.out.println("Not Found");
        else System.out.println("The Index of "+ key+ " is "+index );
    }
}
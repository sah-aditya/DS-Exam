package Queue;

public class Deque {
    static int []arr;
    static int front;
    static int rear;
    static int cap;

    Deque(int capacity){
        arr=new int[capacity];
        this.cap=capacity;
        this.front=0;
        this.rear=0;
    }

    boolean isEmpty(){
        return front==rear;
    }

    boolean isFull(){
        return rear==cap;
    }

    void insertFront(int data){
        if(isFull()){
            System.out.println(("Deque is Full"));
            return;
        }
        else{
            for(int i=rear;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[front]=data;
            rear++;
        }
    }
    void insertRear(int data){
        if(isFull()){
            System.out.println("Deque is Full");
            return;
        }
        else{
            arr[rear]=data;
            rear++;
        }
    }

    int deleteFront(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return -1;
        }
        else{ int res=arr[front];
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return res;
        }
    }

    int deleteRear(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return -1;
        }
        else{
            int res=arr[rear-1];
            rear--;
            return res;
        }
    }

    int getFront(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }

    int getRear(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return -1;
        }
        else{
            return arr[rear-1];
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Deque is Empty");
            return;
        }
        else{
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Deque dq=new Deque(2);
        dq.insertRear(10);

        dq.insertFront(5);
        dq.insertFront(15);
        dq.display();
        System.out.println(dq.getFront());
        System.out.println(dq.getRear());
        dq.deleteFront();
        dq.deleteRear();
        dq.display();
    }

}

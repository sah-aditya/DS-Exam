package Queue;

public class CircularQueue {
    static int [] arr;
    static int front;
    static int rear;
    static int cap;

    CircularQueue(int capacity){
        arr=new int[capacity];
        this.cap=capacity;
        this.front=-0;
        this.rear=0;
    }

    boolean isEmpty(){
        return front==rear;
    }

    boolean isFull(){
        return (rear+1)%cap==front;
    }

    void enqueue(int data){
        if(isFull()){
            System.out.println("Queue Full");
            return;
        }
        else {
            arr[rear] = data;
            rear = (rear + 1) % cap;
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            front=rear=0;
            return -1;
        }
        else{
            int res=arr[front];
            front=(front+1)%cap;
            return res;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Queue Empty");
            return;
        }
        else{
            for(int i=front;i!=rear;i=(i+1)%cap){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue q=new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.enqueue(60);
        q.enqueue(70);
        q.display();
    }
}

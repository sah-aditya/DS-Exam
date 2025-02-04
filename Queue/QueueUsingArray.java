package Queue;

import java.sql.SQLOutput;

public class QueueUsingArray {
    static int [] arr;
    static int front;
    static int rear;
    static int cap;

    QueueUsingArray(int capacity){
        arr=new int[capacity];
        this.cap=capacity;
        this.front=0;
        this.rear=0;
    }

    static boolean isEmpty(){
        return front==rear;
    }

    static boolean isFull(){
        return rear==cap;
    }

    void engueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else{
            arr[rear]=data;
            rear++;
        }
    }

    static int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int res=arr[front];
            for(int i=0;i<rear-1;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return res;
        }
    }

    static void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
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
        QueueUsingArray q=new QueueUsingArray(5);
        q.engueue(10);
        q.engueue(20);
        q.engueue(30);

        q.display();
        System.out.println(q.dequeue());
        q.display();
    }
}

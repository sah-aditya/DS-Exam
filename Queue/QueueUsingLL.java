package Queue;

public class QueueUsingLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static Node front;
    static Node rear;
    static int cap;
    static int size;

    QueueUsingLL(int capacity){
        this.front=null;
        this.rear=null;
        this.cap=capacity;
        this.size=0;
    }

    static boolean isEmpty(){
        return size==0;
    }

    static boolean isFull(){
        return size==cap;
    }

    static void enqueue(int data){
        Node new_node=new Node(data);
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else{
            if(front==null){
                front=new_node;
                rear=new_node;
            }
            else{
                rear.next=new_node;
                rear=new_node;
            }
            size++;
        }
    }

    static int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            int res=front.data;
            int temp=front;
            front=front.next;
            temp=null;
            size--;
            return res;
        }
    }

    static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else{
            return arr[front];
        }
    }


    static void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        else{
            Node temp=front;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        QueueUsingLL q=new QueueUsingLL(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.dequeue();
        q.display();
    }
}

package Stack;


public class StackUsingLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    static Node top;
    static int cap;

    static int size;

    StackUsingLL(int cap){
        this.top=null;
        this.cap=cap;
        this.size=0;
    }

    static boolean isEmpty(){
        return size==0;
    }
    static boolean isFull(){
        return size==cap;
    }

    static void push(int data){
        Node new_node = new Node(data);
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            new_node.next=top;
            top=new_node;
            size++;
        }
    }

    static int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            int res=top.data;
            top=top.next;
            size--;
            return res;
        }
    }

    static void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    static int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return top.data;
        }
    }

    public static void main(String args[]){
        StackUsingLL stack = new StackUsingLL(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.display();
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.display();
    }

}

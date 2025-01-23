package Stack;
import java.util.*;
public class StackUsingArray {
   static int top;
   static int capacity;
   static int stack[];

    StackUsingArray(int capacity){
        this.capacity=capacity;
        this.stack=new int[capacity];
        this.top=-1;
    }

    static boolean isEmpty(){
        return top==-1;
    }
    static boolean isFull(){
        return top==capacity-1;
    }

    static void push(int data){
        if(isFull()){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            stack[++top]=data;

        }


    }

    static int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stack[top--];
        }
    }

    static int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stack[top];
        }
    }

    static void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        else{
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        StackUsingArray s= new StackUsingArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.display();
        System.out.println(s.pop());
        System.out.println(s.peek());
        s.display();

    }

}

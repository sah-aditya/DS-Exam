
import java.util.Scanner;
public class LLInsert {
        static class Node {
            int data;
            Node next;
    
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
    
        Node head = null;
    
        public void begin() {
            int data, n;
            Scanner sc = new Scanner(System.in);
    
            do {
                System.out.println("Enter Data: ");
                data = sc.nextInt();
                Node new_node = new Node(data);
    
                if (head == null) {
                    head = new_node; // Initialize head for the first node
                } else {
                    new_node.next = head; // Insert new node at the beginning
                    head = new_node;
                }
    
                System.out.println("Press 1 to add more data, else enter any other number: ");
                n = sc.nextInt(); // Read the decision value
            } while (n == 1);
        }
        
        public void end(){
            int data, n;
            Scanner sc = new Scanner(System.in);
    
            do {
                System.out.println("Enter Data: ");
                data = sc.nextInt();
                Node new_node = new Node(data);
    
                if (head == null) {
                    head = new_node; // Initialize head for the first node
                } else {
                    Node temp= head;
                    while(temp.next!=null){
                        temp=temp.next;
                    }
                    temp.next=new_node;
                }
    
                System.out.println("Press 1 to add more data, else enter any other number: ");
                n = sc.nextInt(); // Read the decision value
            } while (n == 1);
        }
        
        
        void atK(int k){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Data: ");
               int  data = sc.nextInt();
                Node new_node = new Node(data);
            Node temp=head;
            for(int i=0;i<k-2;i++){
                temp=temp.next;
            }
            new_node.next=temp.next;
            temp.next=new_node;
        }
        
        
        
        public void traverse() {
            if (head == null) {
                System.out.println("Empty List");
            } else {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " --> ");
                    temp = temp.next;
                }
                System.out.println("null"); // End of list
            }
        }
    
        public static void main(String args[]) {
            LLInsert ll = new LLInsert();
            ll.end();
            ll.atK(5);
            ll.traverse();
        }
    }
    
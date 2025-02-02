public class CircularLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head=null;
    Node tail=null;

    public void addBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            tail.next = head;
        }
    }

    public void addEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void addKth(int data, int k){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else{
            Node temp = head;
            for(int i=0;i<k-1;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deleteBegin(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            head = head.next;
            tail.next = head;
            temp.next = null;
        }
    }
    public void deleteEnd(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            while(temp.next!=tail){
                temp = temp.next;
            }
            temp.next = head;
            tail.next = null;
            tail = temp;
        }
    }

    public void deleteKth(int k){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp = head;
            for(int i=0;i<k-1;i++){
                temp = temp.next;
            }
            Node del = temp.next;
            temp.next = del.next;
            del.next = null;
        }
    }

    public void display(){
        Node temp = head;
        if(head==null){
            System.out.println("List is empty");
        }else{
            do{
                System.out.print(temp.data+" ");
                temp = temp.next;
            }while(temp!=head);
        }
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.addBegin(10);
        cll.addBegin(20);
        cll.addEnd(30);
        cll.addEnd(40);
        cll.addKth(50, 2);
        cll.deleteBegin();
        cll.deleteEnd();
        cll.deleteKth(2);
        cll.display();
    }
}

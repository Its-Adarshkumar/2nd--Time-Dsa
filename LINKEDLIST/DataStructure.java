package LINKEDLIST;

class Node{ // user defined data type
    int val;
    Node next; //null

    Node(int val){
        this.val=val;
       // this.next=null; // but iski koi jarurat nahi hai 
    }
}

class linkedList{  // user defined data type
    Node head; // null by defualt
    Node tail; // null by defualt
    int size=0;

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp; //connect
            tail=temp;
        }
        size++;
    }

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp; // first node
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }

    void display(){
        if(head==null) return;
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        head=head.next;
        if(head==null) tail=null;
        size--;
    }
}

public class DataStructure {
    public static void main(String[] args) {
        linkedList ll=new linkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.display();
        ll.addAtHead(0);
        ll.display();
        ll.deleteAtHead();
        ll.display();
        System.out.println(ll.size);
    }
}

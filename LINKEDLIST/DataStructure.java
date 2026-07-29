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

    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty!");
            return;
        }
        head=head.next;
        if(head==null) tail=null;
        size--;
    }

    int search(int val){
        if(head==null) return -1;
        int idx=0;
        Node temp=head;
        while (temp!=null) {
            if(temp.val==val) return idx;
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    void insert(int val,int idx){
        if(idx<0 ||  idx>size){
            System.out.println("invalid idx");
        }

        else if(idx==0) addAtHead(val);
        else if(idx==size) addAtTail(val);
        else {
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            Node t=new Node(val);
            t.next=temp.next;
            temp.next=t;
            size++;
        }
    }

    void delete(int idx){
        if(idx<0 || idx>=size) {
            System.out.println("Invalid idx");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=0;i<idx-1;i++){
           temp=temp.next;
        }
        temp.next=temp.next.next; //delete 
        if(idx==size-1) tail=temp; // deleting tail
        size --;
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
        //System.out.println(ll.size);

        //System.out.println(ll.search(20));

        ll.insert(60,3);
        ll.display(); 

        ll.delete(3); ll.display();
    }
}

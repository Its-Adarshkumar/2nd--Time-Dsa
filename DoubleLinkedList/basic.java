class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}

class DoublyLL{
    Node head;
    Node tail;
    int size;

    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;;
        }
        size++;
    }

    void addAtTail(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(size==0) {
            System.out.println("List is empty");
            return;
        }
        if(size==1) head=tail=null;
        else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }

    void deleteAtTail(){
        if(size==0) {
            System.out.println("List is empty");
            return;
        }
        if(size==1) head=tail=null;
        else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }

    void insert(int idx,int val){
        if(idx<0 || idx>size){
            System.out.println("Invalid idx");
            return;
        }
        if(idx==0){
            addAtHead(val);
            return;
        } 
        if(idx==size){
            addAtTail(val);
            return;
        }
        Node a=new Node(val);
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        a.next=temp.next;
        temp.next=a;
        a.prev=temp;
        a.next.prev=a;
        size++;
    }

    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void displayReverse(){
        if(head==null) return;
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
}
public class basic{
    public static void main(String[] args) {
        DoublyLL list =new DoublyLL();
        list.addAtHead(10);
        list.display();
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(50);
        list.display();
        list.displayReverse();
        //list.deleteAtHead();
        //list.display();
        //list.deleteAtTail();
        list.display();
        list.insert(2, 80);
        list.display();
    }
}
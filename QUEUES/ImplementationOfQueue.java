
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class MyQueue{
    Node head;
    Node tail;
    int size;

    int peek(){
        if(size==0) {
            System.out.println("queue is empty");
            return -1;
        }
        return head.val;
    }
    
    void addAtTAil(int val){
        Node temp=new Node(val);
        if(tail==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }

    int remove(){
        if(size==0) {
            System.out.println("queue is empty");
            return -1;
        }
        int front=head.val;
        head=head.next;
        size--;
        return front;
    }


    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class ImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q= new MyQueue();
        q.addAtTAil(10);
        q.addAtTAil(20);
        q.addAtTAil(30);
        q.addAtTAil(40);
        System.out.println(q.peek());
        q.display();
        q.remove();
        q.display();
    }
}

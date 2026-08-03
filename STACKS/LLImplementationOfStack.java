package STACKS;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class MyStack{
    Node head;
    int length;

    int peek(){ // head ki value
        if (head==null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.val;
    }

    int pop() throws Exception { // return the value then deleteAthead
        if (head==null) {
            throw new Exception("Stack UnderFlow Error");
        }
        int x=head.val;
        head=head.next;
        length--;
        return x;
    }

    void push(int val){ //addAtHead
        Node temp=new Node(val);
        if(length==0) head=temp;
        else{
            temp.next=head;
            head=temp;
        }
        length++;
    }

    int size(){
        return length;
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

public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception{
        MyStack st=new MyStack();
        //st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();

        st.pop();
        st.display();
        System.out.println(st.peek());
        st.size();
        st.display();
    }
}

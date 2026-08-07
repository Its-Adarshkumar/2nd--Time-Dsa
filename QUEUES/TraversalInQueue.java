//package QUEUES;

import java.util.LinkedList;
import java.util.Queue;

public class TraversalInQueue {
    public static void display(Queue<Integer> q){
        int n=q.size();
        for(int i=0;i<n;i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }

    public static void addAtIndex(int idx,int val,Queue<Integer> q){
        int n=q.size();
        if(idx<0 || q.size()<idx){
            System.out.println("invalid idx");
        }
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        q.add(val);
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
    }

    public static int peek(int idx,Queue<Integer> q){
        int n=q.size();
        if(idx<0 || q.size()<idx){
            System.out.println("invalid idx");
            return -1;
        }
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        System.out.println(q.peek());
        for(int i=0;i<n-idx;i++){
            q.add(q.remove());
        }
        return -1;
    }

    public static int remove(int idx,Queue<Integer> q){
        int n=q.size();
        if(idx<0 || q.size()<idx){
            System.out.println("invalid idx");
            return -1;
        }
        for(int i=0;i<idx;i++){
            q.add(q.remove());
        }
        int removed=q.remove();
        for(int i=0;i<n-idx-1;i++){
            q.add(q.remove());
        }
        return removed;
    }
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        //display(q);
        //addAtIndex(2, 60, q);
        display(q); 
        peek(4, q);
        remove(2, q);
        display(q);
    }
}

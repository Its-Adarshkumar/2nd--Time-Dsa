//package HEAP;

import java.util.PriorityQueue;

public class basic {
    public static void main(String[] args) {
        //minheap
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        System.out.println(pq);
        System.out.println(pq.peek());
        for(int ele:pq){
            System.out.print(ele+" ");
        }
    }
}

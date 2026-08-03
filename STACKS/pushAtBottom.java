package STACKS;

import java.util.Stack;

public class pushAtBottom {
    public static void reverse(Stack<Integer> st){
        if(st.size()<=1) return;
        int top=st.pop();
        reverse(st);
        bottom(st, top);
    }
    public static void bottom(Stack<Integer> st,int ele){
        if(st.isEmpty()) {
            st.push(ele);
            return;
        }
        int top=st.pop();
        bottom(st, ele);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(10); //bottom
        st.push(20);
        st.push(30);
        st.push(40); //top
        int ele=50;
        System.out.println(st);
        bottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}

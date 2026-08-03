package STACKS;

import java.util.Stack;

public class basic {
    public static void main(String[] args) {
        Stack<String>st=new Stack<>();
        st.push("Adarsh");
        st.push("Anshu");
        st.push("Reena");
        st.push("Manoj");
        st.push("Sami");
        System.out.println(st.size());
        System.out.println(st);  // A.s =O(n)
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop()); // it returns the topmost ele and then remove it
    }
}

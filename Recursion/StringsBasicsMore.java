package Recursion;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s="adarsh";
        change(s);
        System.out.println(s);

        String [] arr={"santosh","krish","Hemant","preet"};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void change(String s) {
        s="lavish";
    }
}



public class decreasingAndIncreasing {
    public static void fun(int x,int n){
        if(x>n) return;
        if(n!=1) System.out.print(n+" ");
        fun(x,n-1);
        System.out.print(n+" "); 
    }
    public static void main(String[] args) {
        fun(1, 5);
    }
}

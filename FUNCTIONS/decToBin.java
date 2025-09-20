package FUNCTIONS;

public class decToBin {
    public static void decTobin(int n){
        int myNum=n;
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin + rem * (int) Math.pow(10, pow);
            pow++;
            n =n/2;
        }
        System.out.println("Binary of " +myNum + " is "+bin);
    }
    public static void main(String[] args) {
        decTobin(5);
    }
}

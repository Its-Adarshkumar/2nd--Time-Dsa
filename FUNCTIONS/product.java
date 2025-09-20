package FUNCTIONS;

public class product {
    public static int multiply(int a,int b){
        int mul=a*b;
        return mul;
    }

    public static void main(String[] args) {
        int a=3;
        int b=5;
        int product=multiply(a, b);
        System.out.println("Product of 3 * 5 ="+ product);
        
    }
}

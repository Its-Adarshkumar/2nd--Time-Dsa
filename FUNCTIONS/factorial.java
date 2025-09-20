package FUNCTIONS;

import java.util.Scanner;

public class factorial {
    public static int Factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number =" );
        int n=sc.nextInt();

        int finalAnswer=Factorial(n);
        System.out.println("Answer =" + finalAnswer);
    }
}

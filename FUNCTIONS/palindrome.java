package FUNCTIONS;

import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int number){
        int n=number;
        int reverse=0;
        while(n!=0){
            int lastdigit=n%10;
            reverse=reverse *10 +lastdigit;
            n =n/10;
        }

        if(number==reverse){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        if(isPalindrome(a)){
            System.out.println( "Number is Palindrome :"+a);
        }
        else{
            System.out.println("Number is not palindrome :"+a);
        }
    }
}

package Recursion;

import java.util.Scanner;

public class oneToN {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
print(1,n);
}

public static void print(int x,int n){
    if(n<x) return ;
    System.out.println(x); 
    print(x+1,n);
}
}

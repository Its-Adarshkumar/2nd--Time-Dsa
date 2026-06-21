package ARRAY;

import java.util.Scanner;

public class negativeValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter Arrays Elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //printing negative values
        for(int i=0;i<n;i++){
           if (arr[i]<0) System.out.println(arr[i]+ " ");
        }
    }
}

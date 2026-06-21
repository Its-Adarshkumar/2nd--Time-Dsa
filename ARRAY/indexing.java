package ARRAY;

import java.util.Scanner;

public class indexing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x={6,19,7,69,9,171,5};
        // indexing
        System.out.println(x[0]);
        //updating elements
        x[3]=0;
        System.out.println(x[3]);

        int[] arr=new int[4]; // 4 size ka element
        arr[0]=10;
        arr[1]=20;
        arr[2]=150;
        arr[3]=-8;

        //lenth of array - (n-1)
        System.out.println(arr.length);

        //accessing element
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+ " ");
        }

        int[] karan=new int[7];  // default value =0
        // for(int i=0;i<karan.length;i++){
        //     System.out.println(karan[i]);
        // }

        //input
        for(int i=0;i<karan.length;i++){
            System.out.print("Enter number=");
            karan[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<karan.length;i++){
            System.out.println(karan[i]);
        }
    }
}

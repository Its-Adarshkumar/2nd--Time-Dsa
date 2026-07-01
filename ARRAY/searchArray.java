import java.util.*;
import java.util.Scanner;
public class searchArray {
    public static int search(int [] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return x;
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        System.out.print("Enter the Number you want to search=");
        int x=sc.nextInt();
        System.out.println(search(arr,x));
    }
}

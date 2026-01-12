package ARRAYS;
import java.util.*;

public class linearSearch {
    public static int search(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,18};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int index=search(number, key);
        if(index==-1){
            System.out.println("Number is not found");
        }else{
            System.out.println("Number is found at index ="+ index);
        }
    }
}

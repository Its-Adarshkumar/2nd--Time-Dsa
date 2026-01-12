 package ARRAYS;
import java.util.*;

public class first {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        marks[2]=100;

        System.out.println("physics="+ marks[0]);
        System.out.println("chemistry="+ marks[1]);
        System.out.println("maths="+ marks[2]);
        System.out.println("Length of array ="+ marks.length);


    }
}

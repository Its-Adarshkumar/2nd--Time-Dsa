package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int arr[]={5,3,7,12,76,9,34,5};
        //recPrint(arr, 0);
        int ele=76;
        System.out.println(exists(arr,ele,0));
    }

    public static void recPrint(int [] arr,int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr, idx+1);
        System.out.print(arr[idx]+" ");
    }

    public static boolean exists(int arr[],int ele,int idx){
        if(idx==arr.length) return false;
        if(arr[idx]==ele)  return true;
        return exists(arr, ele, idx+1);
        
    }
}
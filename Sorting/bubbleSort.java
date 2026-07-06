package Sorting;

public class bubbleSort {
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,-2,6,7,2,0,7,2};
        int  n=arr.length;
        print(arr);
        // for(int j=0;j<n-1;j++){ //n-1 passes
        //     for(int i=0;i<n-1-j;i++){
        //     if(arr[i]>arr[i+1]){
        //         int temp=arr[i];
        //         arr[i]=arr[i+1];
        //         arr[i+1]=temp;
        //     }
        // }
        // }


        //bubble short optimised
        for(int j=0;j<n-1;j++){ //n-1 passes
            int swap=0;
            for(int i=0;i<n-1-j;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                swap++;
            }
        }
        if(swap==0) break;
        }
        
        System.out.println();
        print(arr);
    }
}

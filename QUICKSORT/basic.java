package QUICKSORT;

public class basic {
    public static void main(String[] args) {
        int [] arr={8,2,4,5,3,7,1};
        missingNum(arr);
    }

    public static int missingNum(int arr[]) {
        int n=arr.length+1; // 1 to n ele
        int i=0;
        while(i<n){
            if(arr[i]==i+1 || arr[i]==n) i++;
            else{
                int idx=arr[i]-1;
                swap(arr,i,idx);
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1) return i+1;
        }
        return n;
    }

    public static void swap(int [] arr,int i,int idx){
        int temp=arr[i];
        arr[i]=arr[idx];
        arr[idx]=temp;
    }
}

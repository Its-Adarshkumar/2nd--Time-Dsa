package ARRAY;

public class maximum {
    public static void main(String[] args) {
        int arr[]={-6,8,14,-2,23,47,4,3,10};
        //int max=arr[0];
        int max=Integer.MIN_VALUE;
        //int max=-1;
        

        for(int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }

        System.out.println(max);

        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.print(min);
    }
}

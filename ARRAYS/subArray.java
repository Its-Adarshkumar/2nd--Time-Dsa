package ARRAYS;

public class subArray {
    public static void printSubarrays(int numbers[]){
        int totalSubarray=0;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){ // i isiliye hai kyuki single element ko bhi print karwna hai 
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.println(numbers[k]+" ");
                }
                totalSubarray++;
                System.err.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray="+totalSubarray);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}

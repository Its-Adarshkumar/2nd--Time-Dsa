package ARRAYS;

public class subarraySum {
    public static void maxSubarraySum(int numbers[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum=currentSum + numbers[k];
                }
                System.out.println("currentSum="+currentSum);
                if(maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("MaximumSum = "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}

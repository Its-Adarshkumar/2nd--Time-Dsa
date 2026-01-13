package ARRAYS;

public class kadanes {
    public static void Kadanes(int numbers[]){
        int currentSum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            currentSum=currentSum+numbers[i];

            if(currentSum<0){
                currentSum=0;
            }
            maxsum=Math.max(maxsum, currentSum);
        }
        System.out.println("Maxsum ="+ maxsum);
    }
    public static void main(String[] args) {
        int numbers[]={-2,-3,4,-1,-2,1,5};
        Kadanes(numbers);
    }
}

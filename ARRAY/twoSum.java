public class twoSum {
    public static boolean sum(int arr[], int target) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int [] arr={12,3,27,53,18,62,88,6,53};
        int target=53;
        System.out.print(sum(arr,target));
    }
}

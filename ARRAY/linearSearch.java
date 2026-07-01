public class linearSearch {
    public static void main(String[] args) {
        int [] arr={12,3,27,53,18,62,88,6,53};
        int target=53;
        boolean flag=false; // false means target arrray me nahi hai
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag=true;
                break;
            }
        }
        if(flag==true) System.out.println("Target exists in array");
        else System.out.println("Targt missing in arrays");
    }
}

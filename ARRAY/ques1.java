public class ques1 {
    public static void multiply(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i % 2 != 0){
            System.out.print(arr[i]*2 + " ");
            }else{
                System.out.print(arr[i]+10 +" ");
            }
        }
        
    }

    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60};
        multiply(arr);
        //add(arr);
    }
}

package TwoDArray;

public class miniMax {
    public static void main(String[] args) {
        int [][]arr={{6,0,2,5},{1,3,7,2},{9,0,4,5},{1,2,3,4}};
        int minEle=Integer.MAX_VALUE;
        

        for(int i=0;i<arr.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>max){
                max=arr[i][j];
                }
                
            }
            System.out.print(max+" ");
            if(minEle>max){
                minEle=max;
            }
        }
        System.out.println();
        System.out.println(minEle);
    }   
}

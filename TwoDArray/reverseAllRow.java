package TwoDArray;

public class reverseAllRow {
    public static void main(String[] args) {
        int [][]arr={{6,0,2,5},{1,3,7,2},{9,0,4,5},{1,2,3,4}};

        for(int i=0;i<arr.length;i++){
            int stCol=0,endCol=arr[0].length-1;
            while (stCol<endCol) {
                int temp=arr[i][stCol];
                arr[i][stCol]=arr[i][endCol];
                arr[i][endCol]=temp;
                stCol++;
                endCol--;
            }
        }

        for(int []a:arr){
            for(int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

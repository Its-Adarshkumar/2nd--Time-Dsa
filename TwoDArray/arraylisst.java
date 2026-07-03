package TwoDArray;

import java.util.ArrayList;

public class arraylisst {
    public static void main(String[] args) {
        ArrayList<Integer>a=new ArrayList<>();
        a.add(3) ; a.add(13);a.add(36);a.add(132);
        ArrayList<Integer>b=new ArrayList<>();
        b.add(3) ; b.add(13);b.add(36);b.add(132);
        ArrayList<Integer>c=new ArrayList<>();
        c.add(3) ; c.add(13);c.add(36);c.add(132);

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        arr.add(c);arr.add(b);arr.add(a);

        // for(int i=0;i<arr.size();i++){
        //     for(int j=0;j<arr.get(i).size();j++){
        //         System.out.print(arr.get(i).get(j) +" ");
        //     }
        //     System.out.println();
        // }

        arr.add(new ArrayList<>());
        for (ArrayList<Integer>list :arr){
            for(int ele: list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }

        System.out.println(arr);
    }
}

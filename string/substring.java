package string;

public class substring {
    public static void main(String[] args) {
        // String s ="adarshkumarsingh";
        // System.out.println(s.substring(0,6)); // 0 t0 4

        String str="gopi";
        
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
            System.out.println();
        }
        
    }
}

public class interning {
    public static void main(String[] args) {
        String s= "raghav";
        //s+="garg";
        String s1=new String("raghav");
        String s2=new String("raghav");
        System.out.println(s1==s2);
    }
}

import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Adarsh");
        System.out.println(sb.length()+" "+sb.capacity());
        System.out.println(sb);
        sb.append("singh");
        System.out.println(sb);
    }
}

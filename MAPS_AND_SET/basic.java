3package MAPS_AND_SET;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(77);
        set.add(65);
        set.add(21);
        set.add(2);
        set.add(45);
        set.add(3);
        set.add(11);
        System.out.println(set.size());
        System.out.println(set.contains(21));
        set.remove(21);
        System.out.println(set.contains(21));
        System.out.println(set.size());
    }
}

//package MAPS_AND_SET;

import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("adarsh", 25);
        map.put("Vivek", 17);
        map.put("kishan", 25);
        map.put("deepika", 19);
        // System.out.println(map);
        // System.out.println(map.size());
        // System.out.println(map.remove("Vivek"));
        // System.out.println(map);
        // System.out.println(map.size());
        // System.out.println(map.get("deepika"));
        // System.out.println(map.containsKey("anshu"));
        for(String key: map.keySet()){
            System.out.println(key +"  "+ map.get(key));
        }
    }
}

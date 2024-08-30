
// Java TreeMap Example - 1

import java.util.*;

public class JavaMap_18 {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<Integer,String>();

        map.put(100, "Shikhar");
        map.put(102, "Rohit");
        map.put(101, "Virat");
        map.put(103, "Kedar");


        for (Map.Entry<Integer,String> mEntry : map.entrySet()) {
            System.out.println(mEntry.getKey()+" "+ mEntry.getValue());
        }
    }
}

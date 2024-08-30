
// Java TreeMap Example -4
// SortedMap

import java.util.SortedMap;
import java.util.TreeMap;

public class JavaMap_21 {
    public static void main(String[] args) {
        SortedMap<Integer,String> map= new TreeMap<Integer,String>();
        map.put(100, "Rohit");
        map.put(102, "Virat");
        map.put(101, "Jaiswal");
        map.put(103, "Pant");
        map.put(104, "Mahi");


        // Current map
        System.out.println(map);

        // Returns key-value pairs whose keys are less than the specified key 
        System.out.println("HeadMap: "+ map.headMap(102));

        // Returns key-value pairs whose keys are greater than or equal to the specified key 
        System.out.println("TailMap: "+ map.tailMap(102));

        // Returns key-value pairs exists in between the specified key.
        // from - inclusive to - exclusive
        System.out.println("SubMap: "+ map.subMap(100, 102));


    }
}

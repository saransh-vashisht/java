
// Java TreeMap Example -3
// NavigableMap

import java.util.NavigableMap;
import java.util.TreeMap;

public class JavaMap_20 {
    public static void main(String[] args) {
        NavigableMap<Integer,String> map= new TreeMap<Integer,String>();
        map.put(100, "Izuku");
        map.put(102, "Ochako");
        map.put(101, "Kachan");
        map.put(103, "Eida");

        // Our current map
        System.out.println(map);


        // Maintains Descending order
        System.out.println("Descending Map: "+ map.descendingMap());

        // Returns key-value pairs whose keys are less than or equal to the specific key.
        System.out.println("HeadMap: "+map.headMap(102,true));

        // Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("TailMap: "+ map.tailMap(102,true));


        // Returns key-value pairs exists between the specified key.
        System.out.println("SubMap: "+ map.subMap(100, false,102,true));
        

    }
}

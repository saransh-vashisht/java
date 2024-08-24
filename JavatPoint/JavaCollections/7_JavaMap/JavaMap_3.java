
// Java Map Example : comparingByKey()

import java.util.HashMap;
import java.util.Map;

public class JavaMap_3 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<Integer,String>();
        
        map.put(18, "Virat");
        map.put(45, "Rohit");
        map.put(7, "Mahi");
        map.put(33, "Pandya");
        map.put(10, "Sachin");
        

        // Returns a Set view of the mappings contained in this map
        map.entrySet()
        //Returns a sequential Stream with this collections as its source 
        .stream()
        //sorted ascending to the provided comparator 
        .sorted(Map.Entry.comparingByKey())
        //Performs an action for each element of this stream
        .forEach(System.out::println);

    }

}

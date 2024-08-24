
// Java Map Example : comparingByValue() in Descending order

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class JavaMap_6 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<Integer,String>();

        map.put(18, "Virat Kohli");
        map.put(33, "Pandya");
        map.put(7, "Mahi");
        map.put(45, "Rohit");
        map.put(10, "Sachin");

        // Returns a Set view of the mappigs contained in this map
        map.entrySet()
        // Returns a sequential Stream with this collection as its source
        .stream()
        //Sorted according to the provided Comparator 
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        //Performs an action for each element of this stream 
        .forEach(System.out::println);
    }
}

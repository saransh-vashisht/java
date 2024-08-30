
// Linked HashMap - 2
// Java LinkedHashMap Example : Key - Value Pair 

import java.util.LinkedHashMap;

public class JavaMap_14 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map= new LinkedHashMap<Integer,String>();

        map.put(100, "Rohit");
        map.put(101, "Virat");
        map.put(103, "Shreyas");

        // Fetching keys 
        System.out.println("Keys: "+ map.keySet());
        // Fetching value 
        System.out.println("Values: "+ map.values());
        // Fetching key-value pair
        System.out.println("Key-Value pairs: "+ map.entrySet());
        
    }
}

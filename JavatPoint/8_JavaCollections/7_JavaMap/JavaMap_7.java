
// Java HashMap - 1
// Java HashMap Example

import java.util.HashMap;
import java.util.Map;

public class JavaMap_7 {
    public static void main(String[] args) {
        // Creating Hashmap
        HashMap<Integer,String> map= new HashMap<Integer,String>();

        // Put elements in Map
        map.put(18, "Virat Kohli");
        map.put(7, "Mahi");
        map.put(33, "Pandya");
        map.put(45, "Rohit");
        map.put(10, "Sachin");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
           System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

// We are storing Integer as the key and String as the value, so we are using HashMap<Integer,String> as the type. 
// The put() method inserts the elements in the map. 
// TO get the key and value elements, we should call the getKey() and getValue() methods. The Map.Entry interface contains the getKey() and getValue() methods, But we should call the entrySet() method of the Map Interface.
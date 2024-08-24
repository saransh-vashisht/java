
// Java HashMap - 2
// No Duplicate Key on HashMap
// We cannot store duplicate keys in HashMap. 

import java.util.HashMap;
import java.util.Map;

public class JavaMap_8 {
    public static void main(String[] args) {
        // Creating HashMap
        HashMap<Integer,String> map= new HashMap<Integer,String>();
        // Put elements in Map
        map.put(18, "Virat");
        map.put(10, "Sachin");
        map.put(45, "Rohit");
        map.put(10, "Sachin");
        // No one else can take the sachin's jersey number

        System.out.println("Iterating Hashmap...");

        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
            
        }

    }
}

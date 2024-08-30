/**
 * JavaMap_1
 * Java Map Example : Non- Generic(Old Style)4
 * 
 */

 //Non-generic
 import java.util.*;

public class JavaMap_1 {
    public static void main(String[] args) {
        Map map= new HashMap();

        // Adding elements to the map 
        map.put(1,"Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        
        // Traversing Map
        Set set = map.entrySet(); //Converting to Set so that we can traverse
        Iterator itr= set.iterator();
        while (itr.hasNext()) {
            // System.out.println(itr.next());

            // Converting to Map.entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+ entry.getValue());


        }
    }
    
}
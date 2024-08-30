
// Java HashTable Example -1 

import java.util.Hashtable;
import java.util.Map;

public class JavaMap_23 {
    public static void main(String[] args) {
        Hashtable<Integer,String> hm= new Hashtable<Integer,String>();

        hm.put(100, "Oshio");
        hm.put(102, "Carens");
        hm.put(101, "Watashi");
        hm.put(103, "Sakushi");

        for (Map.Entry<Integer,String> m : hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
            
        }
        // It will maintain the descending order
        
    }
}

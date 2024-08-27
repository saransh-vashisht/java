
// Java HashTable Example -2 
// Hashtable : remove()

import java.util.Hashtable;

public class JavaMap_24 {
    public static void main(String[] args) {
        Hashtable<Integer,String> map= new Hashtable<Integer,String>();

        map.put(100, "Kia");
        map.put(102, "Hyundai");
        map.put(101, "Suzuki");
        map.put(103, "Tata");

        System.out.println("Before remove: "+ map);
        // remove value for key 102
        map.remove(102);
        System.out.println("After remove: "+ map);
        
    }
}

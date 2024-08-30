
// Java HashTable Example - 4
// putIfAbsent()

import java.util.Hashtable;

public class JavaMap_26 {
    public static void main(String[] args) {
        Hashtable<Integer,String> map= new Hashtable<Integer,String>();
        map.put(100, "Rose");
        map.put(102, "China Rose");
        map.put(101, "SunFlower");
        map.put(103, "Marigold");
        System.out.println("Initial Map: "+ map);

        // Inserts, as the specified pair is unique 
        map.putIfAbsent(104, "Lily");
        // this method will add the value only if there is no other key is present of the same type
        System.out.println("Updated Map: "+ map);
        // Returns the current value as the specified pair already exists
        map.putIfAbsent(101, "Dahlia");
        // it will not change the value if the same key is present 
        System.out.println("Updated Map: "+ map);


    }
}

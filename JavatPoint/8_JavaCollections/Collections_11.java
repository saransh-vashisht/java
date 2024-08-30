
// Set Interface - 2

// HashSet
/*
 * HashSet class implements Set Interface . 
 * It represent the collection that uses a hash table for storage. 
 * Hashing is used to store the elements in the HashSet 
 * It contains a unique items 
 * 
 */

// Example of HashSet

import java.util.HashSet;
import java.util.Iterator;

public class Collections_11 {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> set= new HashSet<String>();
        set.add("Shinobu");
        set.add("Mikasa");
        set.add("Kobayashi");
        set.add("Sakura");

        // Traversing elements
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}

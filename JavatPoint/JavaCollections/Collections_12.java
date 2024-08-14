
// Set Interface -4

/*
 * LinkedHashSet
 * 
 * LinkedHashSet class represents the LinkedList implementation of Set Interface. 
 * It extends the HashSet class and implements the Set Interface. Like HashSet, it also contains unique elements. 
 * It maintains the insertion order and permits its null elements 
 * 
 */


//  Example 

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collections_12 {
    public static void main(String[] args) {
        LinkedHashSet<String> set= new LinkedHashSet<String>();
        set.add("Naruto");
        set.add("Eren");
        set.add("Luffy");
        set.add("Shin");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}


// Java HashSet Example 
// Ignoring duplicate elements

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {
    public static void main(String[] args) {
        // Creating HashSet and adding elements
        HashSet<String> set= new HashSet<String>();
        set.add("Virat");
        set.add("Bumrah");
        set.add("Virat");
        set.add("Raina");
        // Here the hashset will ignore the second virat in the hashset
        

        // Traversing elements 
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}


// Set Interface -6
/*
 * TreeSet
 * 
 * Java TreeSet class implements the Set Interface that uses a tree for storage . 
 * Like HashSet,TreeSet also contains unique elements .
 * 
 * However, the access and retrieval time of TreeSet is quite fast . 
 * 
 * The elements in TreeSet are stored in the ascending order
 * 
 */

import java.util.Iterator;
import java.util.TreeSet;

public class Collections_14 {
    public static void main(String[] args) {
        // Creating and adding elements
        TreeSet<String> set= new TreeSet<String>();
        set.add("Boa Hancock");
        set.add("Nami");
        set.add("Nico Robin");
        set.add("Vivi");

        // traversing elements 
        Iterator<String> itr= set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
}
